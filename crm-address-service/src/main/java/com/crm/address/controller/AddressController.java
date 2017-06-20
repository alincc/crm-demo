package com.crm.address.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crm.address.domain.Address;
import com.crm.address.serviceimpl.AddressServiceImpl;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	AddressServiceImpl addressServiceimpl;
	
	@RequestMapping(value = "/{addressId}", method = RequestMethod.GET)
	public ResponseEntity<Address> getAddress(@PathVariable("addressId") int addressId) {
		System.out.println("*****Welcome to getAddress*****");
		Address address = addressServiceimpl.getAddress(addressId);
		
		if (address == null) {			
			return new ResponseEntity<Address>(HttpStatus.NOT_FOUND);
		}
		System.out.println("Address---->:"+address.getCity());
		return new ResponseEntity<Address>(address, HttpStatus.OK);		
	}
}
