package com.crm.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crm.shop.domain.Shop;
import com.crm.shop.service.ShopService;

@RestController
@RequestMapping("/shop")
public class ShopController {

	@Autowired
	ShopService shopService;
	
	@RequestMapping(value = "/{shopId}", method = RequestMethod.GET)
	public ResponseEntity<Shop> getCustomer(@PathVariable("shopId") int shopId) {
		
		Shop shop = shopService.getShop(shopId);		
		if (shop == null) {			
			return new ResponseEntity<Shop>(HttpStatus.NOT_FOUND);
		}
		
		System.out.println("Shop Name---->:"+shop.getName());		
		return new ResponseEntity<Shop>(shop, HttpStatus.OK);		
	}

}
