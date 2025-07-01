package com.tomignoul.store.service.product;

import com.tomignoul.store.dto.AddProductRequest;
import com.tomignoul.store.model.Product;

import java.util.Optional;

public interface ProductService {
    void addProduct(Product product);
    void addProductFromDto(AddProductRequest request);

    Optional<Product> getProductById(long id);
    Product requireProductById(long id);
}

