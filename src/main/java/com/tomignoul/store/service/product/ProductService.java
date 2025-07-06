package com.tomignoul.store.service.product;

import com.tomignoul.store.dto.product.AddProductRequest;
import com.tomignoul.store.dto.product.SearchProductRequest;
import com.tomignoul.store.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    void addProduct(Product product);
    void addProductFromDto(AddProductRequest request);

    Optional<Product> getProductById(long id);
    Product requireProductById(long id);

    List<String> searchProducts(SearchProductRequest request);

}

