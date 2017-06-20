package com.crm.shop.service;

import com.crm.shop.domain.Shop;

public interface ShopService {
	
	public int createShop(Shop shop);
	
	public Shop getShop(int shopNumber);
	
	public int updateShop(Shop shop);
	
	public int deleteShop(int shopNumber);

}
