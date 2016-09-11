package th.co.tac.kms.web;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.naming.NamingException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.sql.DataSource;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.tomcat.util.descriptor.web.ContextResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jndi.JndiObjectFactoryBean;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

	@Value("${app.name}")
	private String appName;
	
	@Autowired
	private Environment environment;
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Bean
	public ServletListenerRegistrationBean<ServletContextListener> servletContextListener() {

	    ServletContextListener listener = new ServletContextListener() {
	        @Override
	        public void contextInitialized(ServletContextEvent sce) {
	        	sys_log_info("Initialized: " + appName);
	        	Logger logger = LogManager.getLogger(this.getClass());
	        	if ( logger != null ) {
	        		logger.info("Initialized: " + appName);
	        	}
	        }

	        @Override
	        public void contextDestroyed(ServletContextEvent sce) {
//	        	LoggerContext context = (LoggerContext) LogManager.getContext();
//	        	Configurator.shutdown(context);
	        	sys_log_info("Destroyed: " + appName);
	        	Logger logger = LogManager.getLogger(this.getClass());
	        	if ( logger != null ) {
	        		logger.info("Destroyed: " + appName);
	        	}
	        }
	    };

	    return new ServletListenerRegistrationBean<ServletContextListener>(listener);
	}
    
    @Bean
	public TomcatEmbeddedServletContainerFactory tomcatFactory() {
		return new TomcatEmbeddedServletContainerFactory() {

			@Override
			protected TomcatEmbeddedServletContainer getTomcatEmbeddedServletContainer(Tomcat tomcat) {
				tomcat.enableNaming();
				return super.getTomcatEmbeddedServletContainer(tomcat);
			}

			@Override
			protected void postProcessContext(Context context) {
				ContextResource resource = new ContextResource();
				resource.setName(environment.getRequiredProperty("db.jndi.datasource"));
				resource.setType(DataSource.class.getName());
				resource.setProperty("driverClassName", environment.getRequiredProperty("spring.datasource.driverClassName"));
				resource.setProperty("url", environment.getRequiredProperty("spring.datasource.url"));
				resource.setProperty("username", environment.getRequiredProperty("spring.datasource.username"));
				resource.setProperty("password", environment.getRequiredProperty("spring.datasource.password"));
				context.getNamingResources().addResource(resource);
			}
		};
	}
    
    @Bean(destroyMethod="")
	public DataSource dataSource() throws IllegalArgumentException, NamingException {
		JndiObjectFactoryBean bean = new JndiObjectFactoryBean();
		bean.setJndiName("java:comp/env/" + environment.getRequiredProperty("db.jndi.datasource"));
		bean.setProxyInterface(DataSource.class);
		bean.setLookupOnStartup(true);
		bean.afterPropertiesSet();
		return (DataSource) bean.getObject();
	}
    
    protected void sys_log_error(String msg) {
		//INFO 24639 --- [            kms] s.w.s.m.m.a.RequestMappingHandlerAdapter :
		System.out.println(getCurrentDate() + "  INFO 0000 --- [            KMS]                                          : " + msg);
	}
	
	protected void sys_log_info(String msg) {
		//INFO 24639 --- [            kms] s.w.s.m.m.a.RequestMappingHandlerAdapter :
		System.out.println(getCurrentDate() + "  INFO 0000 --- [            KMS]                                          : " + msg);
	}
	
	protected String getCurrentDate() {
		//2016-07-15 15:52:45.307
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss.SSS");
		return formater.format(Calendar.getInstance().getTime());
	}
}
