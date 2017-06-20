package com.crm.customer.service;

import java.util.List;

import com.crm.customer.domain.Address;
import com.crm.customer.domain.Customer;

public interface CustomerService {
	
	public int createCustomer(Customer cutomer);
	
	public int updateCustomer(Customer cutomer);
	
	public Customer getCustomer(int customerId);
	
	public List<Customer> getCustomers();
	
	public void deleteCustomer(int customerId);
	

}
