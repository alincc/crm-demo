package com.crm.customer.repo;

import org.springframework.stereotype.Repository;

import com.crm.customer.domain.Customer;

@Repository
public class CustomerRepository {
		
	public CustomerRepository(){}
	
	public Customer getCustomer(int customerId){
		
		Customer customer = new Customer();
		customer.setCustomerId(1);
		customer.setFirstName("Satheesh");
		customer.setLastName("Chepuri");
		customer.setMiddleName("V");
		customer.setPhoneNumber("9959000950");
		
		return customer;
	}
	
	
}
