package com.server.spring.boot.h2.service;

import com.server.spring.boot.h2.model.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);

    Product updateProduct(Product product);

    List<Product> getAllProduct();

    Product getProductById(long productId);

    void deleteProduct(long id);
    List<Product> searchProducts(String keyword);
}
