package com.springbootcachedemo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.springbootcachedemo.model.Product;
import com.springbootcachedemo.repository.ProductRepository;
import com.springbootcachedemo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	@Cacheable(value="product", key="#id")
	public Product getProductById(String id) {
		System.out.println("Getting data from database");
		return productRepository.findById(id).get();
	}

}
