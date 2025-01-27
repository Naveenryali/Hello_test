package com.example.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.model.Employee;
import com.example.employee.service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	EmpService emps;
	@PostMapping("/add")
	public String add(@RequestBody Employee emp)
	{
		int status =emps.add(emp);
		if(status != -1)
		{
			return "Inserted successfully";
		}
		else
		{
			return "Failed to insert";
		}
		
	}

}
