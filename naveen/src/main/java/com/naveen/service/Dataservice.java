package com.naveen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.naveen.model.Data;
import com.naveen.repository.Datarepo;

@Service
public class Dataservice {
	
	@Autowired
	Datarepo dtr;
	
	public void addData( Data obj)
	{
		System.out.println("Updated");
		dtr.save(obj);
	}
	
	
	public List<Data> showData() {
		
		return dtr.findAll();
		
	}
	
	public Data showDataByID(@PathVariable int id )
	{
		return dtr.findById(id).get();
	}
	
	public Data updateData( int id,Data obj1)
	{
		Data obj2 = dtr.findById(id).get();
		obj2.setName(obj1.getName());
		obj2.setAge(obj1.getAge());
		dtr.save(obj2);
		return obj2;
	}
	
	public void deletebyId(int id)
	{
		dtr.deleteById(id);
		
	}



}
