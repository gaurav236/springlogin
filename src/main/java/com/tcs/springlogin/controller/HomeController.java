package com.tcs.springlogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tcs.springlogin.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	UserService us;
	  
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
