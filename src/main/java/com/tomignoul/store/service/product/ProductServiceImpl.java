package com.tomignoul.store.service.product;

import com.tomignoul.store.model.Product;
import com.tomignoul.store.repository.product.ProductRepository;

import java.util.Optional;

public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    //constructor
    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public void addProduct(Product product){
        productRepository.save(product);
    }

    @Override
    public Optional<Product> getProductById(long id){
        return productRepository.findById(id);
    }

    @Override
    public Product requireProductById(long id){
        return getProductById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with ID: " + id));
    }

}
