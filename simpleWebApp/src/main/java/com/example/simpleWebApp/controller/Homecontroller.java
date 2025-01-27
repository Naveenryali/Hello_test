package com.example.simpleWebApp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {
	
	@GetMapping("/")
	public String greet()
	{
		
		return "Welcome to my page";
	}
	
	@GetMapping("/about")
	public String about()
	{
		return "This is a heading";
	}
	

}
