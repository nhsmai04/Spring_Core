package com.example.spring_aop_jdbc_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.spring_aop_jdbc_demo.config.AppConfig;
import com.example.spring_aop_jdbc_demo.model.Product;
import com.example.spring_aop_jdbc_demo.service.ProductService;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService service = context.getBean(ProductService.class);

        service.addProduct(new Product(1, "Bánh mì"));
        service.listProducts();
    }
}
