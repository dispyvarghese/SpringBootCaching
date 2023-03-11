package com.springbootcachedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springbootcachedemo.model.Product;
import com.springbootcachedemo.serviceImpl.ProductServiceImpl;

@RestController
public class ProductController {

	@Autowired
	private ProductServiceImpl productservice;
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable String id) {
		return productservice.getProductById(id);
	}
}
