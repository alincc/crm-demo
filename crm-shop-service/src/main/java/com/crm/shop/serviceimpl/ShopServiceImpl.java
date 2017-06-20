package com.crm.shop.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.shop.domain.Address;
import com.crm.shop.domain.Shop;
import com.crm.shop.remoteservice.AddressMicroserviceCall;
import com.crm.shop.repository.ShopRepository;
import com.crm.shop.service.ShopService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ShopServiceImpl implements ShopService {

	@Autowired
	private AddressMicroserviceCall addressSeviceCall;
	
	@Autowired
	private ShopRepository shopRepository;
	
	@Override
	public int createShop(Shop shop) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@HystrixCommand(fallbackMethod="handleExternalServiceDown")
	public Shop getShop(int shopNumber) {
		
		Shop shop = shopRepository.getShop(shopNumber);
		
		Address address = addressSeviceCall.getShopAddress(shop.getAddress().getAddressId());
		shop.setAddress(address);
		
		return shop;
	}

	@Override
	public int updateShop(Shop shop) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteShop(int shopNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Shop handleExternalServiceDown(int shopNumber)
	{
		Shop shop = shopRepository.getShop(shopNumber);
		
		// Read the last known position for this vehicle
		Address address = new Address();
		address.setAddressId(100);
		address.setStreetAdd1("temp streataddress1");
		address.setStreetAdd2("temp streataddress2");
		address.setCity("hyderabad");
		address.setState("ts");
		address.setZip("500072");
		
		shop.setAddress(address);
		return shop;
	}
}
