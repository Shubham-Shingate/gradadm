package com.panther.gradadm;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		UserBuilder users = User.withDefaultPasswordEncoder();

		// Add in memory users, passwords and roles
		auth.inMemoryAuthentication().withUser(users.username("Shubham").password("Shubham@2234").roles("STUDENT"));
		auth.inMemoryAuthentication().withUser(users.username("Vaibhavi").password("Vaibhavi@2234").roles("STUDENT"));
		auth.inMemoryAuthentication().withUser(users.username("Chintu").password("Chintu@2234").roles("ADMIN","STUDENT"));
	}

	/*
	 * This configuration is related to the URL's of our application login, logout
	 * pages etc.
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		 .antMatchers("/").permitAll() // allow public access to landing page
		 .antMatchers("/signup").permitAll() // allow public access to signup page
         .antMatchers("/students/**").hasRole("STUDENT")
         .antMatchers("/admins/**").hasRole("ADMIN")
		 .and()
			.formLogin()
			.loginPage("/graduateApplicationLogin")
			.loginProcessingUrl("/authenticateTheUser")
			.permitAll()
		 .and()
		 	.logout()
		 	.logoutSuccessUrl("/")
		 	.permitAll()
		 .and()
		 	.exceptionHandling()
		 	.accessDeniedPage("/accessDenied");
		
		
		/*
		 * The .logout() will add a spring security logout support that will be exposed
		 * at default url- "context-root(application root path)/logout". So to logout from app(and redirect to loginPage), we need send data(or hit) to this default url on click of logout button 
		 */
	}
}