package com.yavdhesh.springsecuritydemo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		/*UserBuilder usb=User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication()
		.withUser(usb.username("yavdhesh").password("yavdhesh").roles("EMPLOYEE"))
		.withUser(usb.username("harsh").password("harsh").roles("EMPLOYEE","MANAGER"))
		.withUser(usb.username("shraddha").password("shraddha").roles("EMPLOYEE","ADMIN"));*/
		
		//ab yahaa jdbc waalaa authentication hogaa
		
		auth.jdbcAuthentication().dataSource(dataSource);
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	//alag hai ye code
		
		http.authorizeRequests().
		antMatchers("/").authenticated().// ye authnticate hogi loginpage dwaaraa
		antMatchers("/saamaanya").permitAll(). // ye waalaa permitAll saamaansya logo ke chalegaa
		antMatchers("/home").hasAnyRole("EMPLOYEE","MANAGER","ADMIN") //yeh authenticate hogaa aur role ke liye authorize bhi
		.antMatchers("/leaders/**").hasRole("MANAGER")
		.antMatchers("/admins/**").hasRole("ADMIN")
		.and().formLogin().
		loginPage("/showLoginPage").loginProcessingUrl("/authenticateTheUser")
		.permitAll()
		.and()
		.logout().permitAll()
		.and().exceptionHandling().accessDeniedPage("/accessDenied");
		
		/*http.authorizeRequests()
        .antMatchers("/").permitAll()  // allow public access to home page
        .antMatchers("/employees").hasRole("EMPLOYEE")
        .antMatchers("/leaders/**").hasRole("MANAGER")
        .antMatchers("/systems/**").hasRole("ADMIN")
        .and()
        .formLogin()
        .loginPage("/showMyLoginPage")
        .loginProcessingUrl("/authenticateTheUser")
        .permitAll()
        .and()
        .logout()
        .logoutSuccessUrl("/")  // after logout then redirect to landing page (root)
        .permitAll();*/
	}

/*	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated().and()
		.formLogin().loginPage("/showLoginPage")
		.loginProcessingUrl("/authenticateTheUser")
		.permitAll();
	}
	*/

}
