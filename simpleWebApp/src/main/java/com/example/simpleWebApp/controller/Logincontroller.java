package com.example.simpleWebApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Logincontroller {
	
	@GetMapping("/login")
	public String login()
	{
		return "login page";
	}

}
