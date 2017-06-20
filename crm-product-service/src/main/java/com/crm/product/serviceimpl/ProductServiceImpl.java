package com.crm.product.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.product.domain.Manufracturer;
import com.crm.product.domain.Product;
import com.crm.product.remoteservice.ManufracturerMicroserviceCall;
import com.crm.product.repository.ProductRepository;
import com.crm.product.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ManufracturerMicroserviceCall manufracturerMicroserviceCall;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public int createProduct(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@HystrixCommand(fallbackMethod="handleManufracturerServiceDown")
	public Product getProduct(int productId) {
		
		Product product = productRepository.getProduct(productId);
		
		Manufracturer manufracturer = manufracturerMicroserviceCall.getManufracturer(product.getManufracturer().getManufracturerNumber());
		
		product.setManufracturer(manufracturer);
		
	
		return product;
	}

	@Override
	public int updateProduct(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteProduct(int productId) {
		// TODO Auto-generated method stub
		return 0;
	}


	public Product handleManufracturerServiceDown(int productId)
	{
		Product product = productRepository.getProduct(productId);
		
		Manufracturer manufracturer = new Manufracturer();
		manufracturer.setManufracturerNumber(product.getManufracturer().getManufracturerNumber());
				
		return product;
	}

}
