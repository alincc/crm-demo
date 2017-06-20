package com.crm.product.service;

import com.crm.product.domain.Product;

public interface ProductService {
	
	public int createProduct(Product product);
	
	public Product getProduct(int productId);
	
	public int updateProduct(Product product);
	
	public int deleteProduct(int productId);
	
}
