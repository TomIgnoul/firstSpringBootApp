package com.tomignoul.store.service.product;

import com.tomignoul.store.model.Product;

import java.util.Optional;

public interface ProductService {
    void addProduct(Product product);

    Optional<Product> getProductById(long id);
    Product requireProductById(long id);
}

