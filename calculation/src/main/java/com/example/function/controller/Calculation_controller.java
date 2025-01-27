package com.example.function.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.function.mode.Calculation_model;
import com.example.function.service.Calculation_service;

@RestController
@RequestMapping("/home")
public class Calculation_controller {
	@Autowired
	Calculation_service cal;
	@GetMapping("/add")
	public int add(@RequestParam int number1, @RequestParam int number2) {
		return cal.add(number1,number2);
	}
	@GetMapping("/sub/{number1}/{number2}")
	public int sub(@PathVariable int number1,@PathVariable int number2)
	{
		return cal.sub(number1,number2);
	}
	@PostMapping("/multiply")
	public int multiply(@RequestBody Calculation_model request)
	{
		return cal.multiply(request.getNumber1(),request.getNumber2());
	}
	@GetMapping("/div/{number1}/{number2}")
	public String div(@PathVariable int number1,@PathVariable int number2)
	{
		String result =cal.div(number1, number2);
		return "divison of "+number1+" with "+number2+" = "+result;
	}
	@PostMapping("/div")
	public String division(@RequestBody Calculation_model request)
	{
		String result = cal.division(request.getNumber1(),request.getNumber2());
		return "divison of "+request.getNumber1()+" with "+request.getNumber2()+" = "+result;
	}
}
