package com.example.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.employee.model.Employee;

@Service
public class EmpService {
	
	@Autowired
	JdbcTemplate jdbc;
	public int add(Employee emp)
	{
		int Id = emp.getId();
		String empName=emp.getEmpName();
		int age=emp.getAge();
		String department=emp.getDepartment();
		
		String query="INSERT INTO employee(id,empName,age,department)values(?,?,?,?)";
		int status =jdbc.update(query,Id,empName,age,department);
		return status;
		
	}
	

}
