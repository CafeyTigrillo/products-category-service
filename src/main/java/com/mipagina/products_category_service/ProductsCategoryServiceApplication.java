package com.mipagina.products_category_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductsCategoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsCategoryServiceApplication.class, args);
	}

}
