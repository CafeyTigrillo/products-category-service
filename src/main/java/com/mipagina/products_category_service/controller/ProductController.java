package com.mipagina.products_category_service.controller;

import com.mipagina.products_category_service.model.Product;
import com.mipagina.products_category_service.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/products/{id_category}")
    public List<Product> getProductsCategoryById(@PathVariable Long id_category){
        return productService.getProductsCategoryById(id_category);
    }
}
