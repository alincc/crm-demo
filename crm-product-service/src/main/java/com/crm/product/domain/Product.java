package com.crm.product.domain;

public class Product {
	
	private int productId;	
	private double price;
	private String type;	
	private Manufracturer manufracturer;
	
	public Product(){}
	
	public Product(int productId, double price, String type, Manufracturer manufracturer){
		this.productId = productId;
		this.manufracturer = manufracturer;
		this.price = price;
		this.type = type;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Manufracturer getManufracturer() {
		return manufracturer;
	}

	public void setManufracturer(Manufracturer manufracturer) {
		this.manufracturer = manufracturer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
