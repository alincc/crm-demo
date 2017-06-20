package com.crm.customer.domain;

public class Address {
	
	private int addressId;
	private String streetAdd1;
	private String streetAdd2;
	private String city;
	private String state;
	private String zip;
	
	public Address(){}
	public Address(int addressId, String streetAdd1, String streetAdd2, String city, String state, String zip){
		
		this.addressId = addressId;
		this.streetAdd1 = streetAdd1;
		this.streetAdd2 = streetAdd2;
		this.city = city;
		this.state = state;
		this.zip = zip;				
		
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreetAdd1() {
		return streetAdd1;
	}

	public void setStreetAdd1(String streetAdd1) {
		this.streetAdd1 = streetAdd1;
	}

	public String getStreetAdd2() {
		return streetAdd2;
	}

	public void setStreetAdd2(String streetAdd2) {
		this.streetAdd2 = streetAdd2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
			
	
	

}
