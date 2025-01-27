package com.naveen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.model.Data;
import com.naveen.repository.Datarepo;
import com.naveen.service.Dataservice;

@RestController
public class DataController {
	
	@Autowired
	Dataservice dtr;
	@PostMapping("/data/add")
	public void addData(@RequestBody Data obj)
	{
		System.out.println("Updated");
		dtr.addData(obj);
	}
	
	@GetMapping("/data")
	public List<Data> showData() {
		
		return dtr.showData();
		
	}
	@GetMapping("/data/{id}")
	public Data showDataByID(@PathVariable int id )
	{
		return dtr.showDataByID(id);
	}
	@PutMapping("/data/{id}")
	public Data updateData(@PathVariable int id, @RequestBody Data obj1)
	{
//		Data obj2 = dtr.findById(id).get();
//		obj2.setName(obj1.getName());
//		obj2.setAge(obj1.getAge());
//		dtr.save(obj2);
//		return obj2;
		
		return dtr.updateData(id, obj1);
	}
	@DeleteMapping("/data/{id}")
	public void deletebyId(@PathVariable int id)
	{
		dtr.deletebyId(id);
		
	}

}
