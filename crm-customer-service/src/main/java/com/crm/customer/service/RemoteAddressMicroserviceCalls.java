package com.crm.customer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.customer.domain.Address;

@FeignClient(name="crm-address-service")
public interface RemoteAddressMicroserviceCalls {
	
	@RequestMapping(method=RequestMethod.GET, value="/address/{id}")
	public Address getCustomerAddress(@PathVariable("id") int id);

}
