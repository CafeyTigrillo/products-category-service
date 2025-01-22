package com.mipagina.products_category_service.service;

import com.mipagina.products_category_service.model.Product;

import java.util.List;

public interface IProductService {
    public List<Product> getProductsCategoryById(Long id_category);
}
