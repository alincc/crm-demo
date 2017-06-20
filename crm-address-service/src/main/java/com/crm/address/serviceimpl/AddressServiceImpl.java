package com.crm.address.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.address.domain.Address;
import com.crm.address.repo.AddressRepository;
import com.crm.address.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	AddressRepository addressRepository;
	
	@Override
	public Address getAddress(int addressId) {
		
		return addressRepository.getAddress(addressId);
	}
}
