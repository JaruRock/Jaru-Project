package th.co.tac.kms.web.config.sql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * <p> SODA Project </p>
 * @version 1.0
 * @author Phongsathorn Anguyarn <phongsathorn@xp-link.com>
 * @since September, 2016
 *
 */

@Configuration
@PropertySource("classpath:config.sql.xml")
public class SQLPropertyFileConfig {

	@Autowired
	private Environment env;
	
	public String getSql(String key) {
		return env.getProperty(key);
	}
	
	public static String removeNewLineAndTab(final String str) {
		return str.replaceAll("\n|\t", " ");
	}
}
