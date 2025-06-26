package com.tomignoul.store.service.product;

import com.tomignoul.store.model.Product;

public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    //constructor
    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository
    }

    @Override
    public void addProduct(Product product){
        productRepository.save(product);
    }


}
