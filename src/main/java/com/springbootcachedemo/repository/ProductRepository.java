package com.springbootcachedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootcachedemo.model.Product;


public interface ProductRepository extends JpaRepository<Product, String> {

}
