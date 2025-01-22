package com.mipagina.products_category_service.service;

import com.mipagina.products_category_service.model.Product;
import com.mipagina.products_category_service.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{

    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> getProductsCategoryById(Long id_category) {
        return productRepository.findProductsByCategoryId(id_category);
    }
}
