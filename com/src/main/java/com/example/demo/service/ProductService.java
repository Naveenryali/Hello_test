package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;

@Service
public class ProductService {
		List<Product> products=Arrays.asList(
				new Product("naveen",23),
				new Product("vasu",21));
		
		public List<Product> getProducts()
		{
			return products;
		}
	} 

