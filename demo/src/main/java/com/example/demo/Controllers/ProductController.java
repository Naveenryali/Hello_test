package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Product;
import com.example.demo.Services.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService ps;
	@GetMapping("/products")
	public List<Product> getProducts()
	{
		return ps.getProducts();
	}
	@GetMapping("/products/{prodId}")
	public Product getProductById(@PathVariable int prodId)
	{
		return ps.getProductById(prodId);
	}
}
