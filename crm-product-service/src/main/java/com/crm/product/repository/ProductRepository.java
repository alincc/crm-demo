package com.crm.product.repository;

import org.springframework.stereotype.Repository;

import com.crm.product.domain.Manufracturer;
import com.crm.product.domain.Product;

@Repository
public class ProductRepository {
	
	public ProductRepository(){}
	
	public Product getProduct(int productId){
		
		Product product = new Product();
		product.setProductId(1);
		product.setPrice(100.50);
		product.setType("abc");
		
		product.setManufracturer(new Manufracturer(1001,""));
		
		return product;
	}
	
	

}
