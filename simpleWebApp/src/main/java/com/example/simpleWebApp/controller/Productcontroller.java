package com.example.simpleWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.simpleWebApp.model.Product;
import com.example.simpleWebApp.service.Productservice;

@RestController
public class Productcontroller {
	
	@Autowired
	Productservice service;
	
	@GetMapping("/products")
 	public List<Product> getproducts()
	{
		return service.getproducts();
	}
	@GetMapping("/products/{prodId}")
	public Product getProductById(@PathVariable int prodId)
	{
		return service.getProductById(prodId);
	}
	
	@PostMapping("/products")
	public void addProduct(@RequestBody Product prod)
	{
		System.out.println(prod);
		 service.addProduct(prod);
	}
	
	@PutMapping("/products")
	public void updateProduct(@RequestBody Product prod )
	{
		System.out.println("Updated");
		service.updateProduct(prod);
	}

	@DeleteMapping("/products/{prodId}")
	public void  deleteProduct(@PathVariable int prodId)
	{
		System.out.println("Deleted");
		service.deleteProduct(prodId);
	}
}
