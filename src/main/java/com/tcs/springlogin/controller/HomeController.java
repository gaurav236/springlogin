package com.tcs.springlogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	  
	@RequestMapping(value = "/")
	public String prelogin()
	{
		System.out.println("welcome");
		return "login";
		
		
	}
	
	@RequestMapping(value="/log")
	public String login(@RequestParam String user,@RequestParam String pass)
	{
		System.out.println(user);
		System.out.println(pass);
		
		return "registration";
		
		
	}

}
