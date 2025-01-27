package com.data.db.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StoreInformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer storeId;
	@Column
	private String storeName;
	@Column
	private String storeDetails;
	@Column
	private String storePhoneNumber;
	public StoreInformation() {
		super();
	}
	public StoreInformation( String storeName, String storeDetails, String storePhoneNumber) {
		super();
		
		this.storeName = storeName;
		this.storeDetails = storeDetails;
		this.storePhoneNumber = storePhoneNumber;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreDetails() {
		return storeDetails;
	}
	public void setStoreDetails(String storeDetails) {
		this.storeDetails = storeDetails;
	}
	public String getStorePhoneNumber() {
		return storePhoneNumber;
	}
	public void setStorePhoneNumber(String storePhoneNumber) {
		this.storePhoneNumber = storePhoneNumber;
	}
	
	
	
	

}
