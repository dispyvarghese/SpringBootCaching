package com.springbootcachedemo.service;

import org.springframework.stereotype.Service;

import com.springbootcachedemo.model.Product;

@Service
public interface ProductService {

	Product getProductById(String id);

}
