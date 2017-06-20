package com.crm.shop.domain;

public class Shop {
	
	private int shopNumber;
	
	private String name;
	
	private Address address;
	
	public Shop(){}
	
	public Shop(int shopNumber, String name, Address address){
		
		this.shopNumber = shopNumber;
		this.name =name;
		this.address = address;
				
	}

	public int getShopNumber() {
		return shopNumber;
	}

	public void setShopNumber(int shopNumber) {
		this.shopNumber = shopNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	

}
