package th.co.tac.kms.web.config.security.util;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public class SecurityPageConfigurationUtil {

	private SecurityPageConfigurationUtil() {}
	
	public static void userManagement(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/user-list")
		.access("hasRole('01')")
		
		.antMatchers("/new-user/**")
		.access("hasRole('01001')")
		
		.antMatchers("/edit-user-*")
		.access("hasRole('01002')")
		
		.antMatchers("/delete-user-*")
		.access("hasRole('01003')");
	}
	
	public static void groupManagement(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/group-list")
		.access("hasRole('02')")
		
		.antMatchers("/new-user/**")
		.access("hasRole('02001')")
		
		.antMatchers("/edit-user-*")
		.access("hasRole('02002')")
		
		.antMatchers("/delete-user-*")
		.access("hasRole('02003')");
	}
	
}
