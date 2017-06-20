package com.crm.product.domain;

public class Manufracturer {
	
	private int manufracturerNumber;
	private String name;
	
	public Manufracturer(){}
	
	public Manufracturer(int manufracturerNumber, String name){
		
		this.manufracturerNumber = manufracturerNumber;
		this.name = name;
		
	}

	public int getManufracturerNumber() {
		return manufracturerNumber;
	}

	public void setManufracturerNumber(int manufracturerNumber) {
		this.manufracturerNumber = manufracturerNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
