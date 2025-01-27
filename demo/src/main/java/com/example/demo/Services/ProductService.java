package com.example.demo.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Model.Product;

@Service
public class ProductService {
 
	
	List<Product> products=new ArrayList(Arrays.asList(
			new Product(1,"mouse",500),
			new Product(2,"Keyboard",1000)));
	

	public List<Product> getProducts() {
		return products;
	}


	public Product getProductById(int prodId) {
		return products.stream().filter(p ->p.getProdId()==prodId).findFirst().get();
	}

}
