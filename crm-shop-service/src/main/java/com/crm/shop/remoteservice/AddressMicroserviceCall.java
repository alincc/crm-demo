package com.crm.shop.remoteservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.shop.domain.Address;

@FeignClient(name="crm-address-service")
public interface AddressMicroserviceCall {
	
	@RequestMapping(method=RequestMethod.GET, value="/address/{addressId}")
	public Address getShopAddress(@PathVariable("addressId") int id);

}
