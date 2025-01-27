package com.data.db.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.db.demo.entity.StoreInformation;
import com.data.db.demo.repository.StoreInformationRepository;

@RestController
@RequestMapping("/home")
public class Storecontroller {
	
	@Autowired
	StoreInformationRepository srepo;
	
	@PostMapping("/add")
	public void add(@RequestBody StoreInformation storeinfo)
	{
		System.out.println(storeinfo);
		System.out.println("inserted");
	srepo.save(storeinfo);
	}
	@GetMapping("/store")
	public List<StoreInformation> getstoreInformation()
	{
		List<StoreInformation> sinfo=srepo.findAll();
		return sinfo;
	}
	@GetMapping("/store/{store_id}")
	public StoreInformation getstoreInformation(@PathVariable int store_id)
	{
		StoreInformation sinfobyid=srepo.findById(store_id).get();
		System.out.println("success");
		return sinfobyid;
	}
}
