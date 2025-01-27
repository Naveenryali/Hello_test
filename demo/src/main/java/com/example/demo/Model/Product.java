package com.example.demo.Model;

public class Product {
int prodId;
String prodName;
int prodPrice;

public Product(int prodId, String prodName, int prodPrice) {
	super();
	this.prodId = prodId;
	this.prodName = prodName;
	this.prodPrice = prodPrice;
}
public int getProdId() {
	return prodId;
}
public void setProdId(int prodId) {
	this.prodId = prodId;
}
public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
}
public int getProdPrice() {
	return prodPrice;
}
public void setProdPrice(int prodPrice) {
	this.prodPrice = prodPrice;
}
@Override
public String toString() {
	return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + "]";
}

}
