package com.yavdhesh.springsecuritydemo;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringSecurityDemoDispatcherInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[]{SpringApplicationConfig.class}; //context hierarchy//rooot webapplication context saajhaa hotaa hai
		//sabhi servlet ke context me isliye root waalaa sabhi child dispacther ko milegaa delegate hogaa
		//atah hum ekaadhik dispacther bhi banaa sakte hai
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[]{};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[]{"/"};
	}

}
