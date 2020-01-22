package com.yavdhesh.springsecuritydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	
	/*@GetMapping("/showLoginPage")
	public String ShowcustomLogin(){
		
		return "plain-login";
	}
*/

	@GetMapping("/showLoginPage")
	public String ShowcustomLogin(){
		
		return "fancy-login";
	}




}
