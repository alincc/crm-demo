package com.crm.customer.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.customer.domain.Address;
import com.crm.customer.domain.Customer;
import com.crm.customer.repo.CustomerRepository;
import com.crm.customer.service.CustomerService;
import com.crm.customer.service.RemoteAddressMicroserviceCalls;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class CusotmerServiceImpl implements CustomerService {
	
	@Autowired
	private RemoteAddressMicroserviceCalls addressMicroserviceCalls;

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public int createCustomer(Customer cutomer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateCustomer(Customer cutomer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@HystrixCommand(fallbackMethod="handleExternalServiceDown")
	public Customer getCustomer(int customerId) {
		
		Address address = addressMicroserviceCalls.getCustomerAddress(customerId);
		
		Customer customer = customerRepository.getCustomer(customerId);
		customer.setAddress(address);

		return customer;
	}

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer(int customerId) {
		// TODO Auto-generated method stub

	}
		
	public Customer handleExternalServiceDown(int customerId)
	{
		Customer customer = customerRepository.getCustomer(customerId);
		
		// Read the last known position for this vehicle
		Address address = new Address();
		address.setAddressId(100);
		address.setStreetAdd1("temp streataddress1");
		address.setStreetAdd2("temp streataddress2");
		address.setCity("hyderabad");
		address.setState("ts");
		address.setZip("500072");
		
		customer.setAddress(address);
		return customer;
	}

}
