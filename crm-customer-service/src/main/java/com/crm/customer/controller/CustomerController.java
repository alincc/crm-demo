package com.crm.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crm.customer.domain.Customer;
import com.crm.customer.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer cutomer){
		
		customerService.createCustomer(cutomer);
		return new ResponseEntity<Customer>(cutomer, HttpStatus.CREATED);
		
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Customer> getCustomer(@PathVariable("id") int id) {
		
		Customer customer = customerService.getCustomer(id);		
		if (customer == null) {			
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
		
		System.out.println("Customer Name---->:"+customer.getFirstName());		
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);		
	}

}
