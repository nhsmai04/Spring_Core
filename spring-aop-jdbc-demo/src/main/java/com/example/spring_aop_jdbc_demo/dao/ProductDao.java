package com.example.spring_aop_jdbc_demo.dao;

import java.util.List;

import com.example.spring_aop_jdbc_demo.model.Product;

public interface ProductDao {
	void addProduct(Product product);
    List<Product> getAllProducts();
}
