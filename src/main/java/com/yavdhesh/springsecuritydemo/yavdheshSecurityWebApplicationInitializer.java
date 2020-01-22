package com.yavdhesh.springsecuritydemo;

import javax.annotation.PostConstruct;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class yavdheshSecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

	
	@PostConstruct
	public void securityShuruaat(){
		System.out.println("AbstractSecurityWebApplicationInitializer chal gayaa");
		//iske ke baad filter karne padenge 
	}
	
	//AbstractAnnotationConfigDispatcherServletInitializer sa=new  AbstractAnnotationConfigDispatcherServletInitializer
	//AbstractSecurityWebApplicationInitializer
	//WebSecurityConfigurerAdapter
	//WebSecurityConfigurerAdapter
}
