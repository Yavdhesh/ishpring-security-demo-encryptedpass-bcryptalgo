package com.yavdhesh.springsecuritydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DemoController {

	
	@GetMapping("/home")
	public String GruhPrasthaaDIkhaao(){
		
		return "home";
	}
	
	@GetMapping("/leaders")
	public String getLeaderPage(){
		
		return "leaders";
	}
	
	@GetMapping("/admins")
	public String getAdminPage(){
		
		return "admin";
	}
	
	@GetMapping("/accessDenied")
	public String getAccessDeniedPage(){
		
		return "accessDenied";
	}
	
	@GetMapping("/saamaanya")
	public String getsaamaanyaPage(){
		
		return "saamaanya";
	}
	
	
}
