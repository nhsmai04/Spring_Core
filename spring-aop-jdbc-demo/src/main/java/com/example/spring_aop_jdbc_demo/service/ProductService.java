package com.example.spring_aop_jdbc_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.spring_aop_jdbc_demo.dao.ProductDao;
import com.example.spring_aop_jdbc_demo.model.Product;

@Component
public class ProductService {
	@Autowired
    private ProductDao productDao;

    public void addProduct(Product product) {
        System.out.println("Adding product inside service");
        productDao.addProduct(product);
    }

    public void listProducts() {
        List<Product> products = productDao.getAllProducts();
        for (Product p : products) {
            System.out.println(p.getId() + " - " + p.getName());
        }
    }
}
