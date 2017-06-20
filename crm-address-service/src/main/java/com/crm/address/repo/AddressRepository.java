package com.crm.address.repo;

import org.springframework.stereotype.Repository;

import com.crm.address.domain.Address;

@Repository
public class AddressRepository {
	
	AddressRepository(){}
	
	public Address getAddress(int addressId){
		
		Address address = new Address(1,"streetAdd1","streetAdd2","city","state","zip");
		
		return address;
	}
}
