package th.co.tac.kms.web.config.hibernate;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan({ "th.co.tac.kms.web.config.hibernate" })
@PropertySource(value = { "classpath:application.properties" })
public class HibernateConfiguration {

	@Autowired
	private Environment environment;

	@Lazy
	@Autowired()
	protected DataSource dataSource;
	
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(this.dataSource);
		sessionFactory.setPackagesToScan(new String[] { "th.co.tac.kms.web.dao.model" });
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
	}

	private Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", this.environment.getRequiredProperty("hibernate.dialect"));
		properties.put("hibernate.show_sql", this.environment.getRequiredProperty("hibernate.show_sql"));
		properties.put("hibernate.format_sql", this.environment.getRequiredProperty("hibernate.format_sql"));
		return properties;
	}

	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory);
		return txManager;
	}
}
