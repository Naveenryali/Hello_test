package com.example.simpleWebApp.model;

import org.springframework.stereotype.Component;

@Component
public class Product {
	
	private int prodId;
	private String prodname;
	private int price;
	
	public Product() {
		super();
	}
	public Product(int prodId, String prodname, int price) {
		super();
		this.prodId = prodId;
		this.prodname = prodname;
		this.price = price;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodname=" + prodname + ", price=" + price + "]";
	}
	
	
	
	

}
