package com.crm.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crm.product.domain.Product;
import com.crm.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "/{productId}", method = RequestMethod.GET)
	public ResponseEntity<Product> getCustomer(@PathVariable("productId") int productId) {
		
		Product product = productService.getProduct(productId);		
		if (product == null) {			
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
		
		System.out.println("Product Name---->:"+product.getPrice());		
		return new ResponseEntity<Product>(product, HttpStatus.OK);		
	}

}
