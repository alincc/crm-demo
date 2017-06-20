package com.crm.shop.repository;

import org.springframework.stereotype.Repository;

import com.crm.shop.domain.Shop;

@Repository
public class ShopRepository {
	
	public ShopRepository(){}
	
	public Shop getShop(int shopNumber){
		
		Shop shop = new Shop();
		shop.setShopNumber(1);
		shop.setName("RTS");
		
		return shop;
		
	}
	
 
}
