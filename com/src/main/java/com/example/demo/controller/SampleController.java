package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RestController
public class SampleController {
	
	@Autowired
	ProductService service;
	//import org.springframework.stereotype.Controller;

@GetMapping("/products")
public List<Product> getProducts()
{
   return service.getProducts();
}
}
