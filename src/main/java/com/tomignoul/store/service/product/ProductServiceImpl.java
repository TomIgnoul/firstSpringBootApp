package com.tomignoul.store.service.product;

import com.tomignoul.store.dto.AddProductRequest;
import com.tomignoul.store.model.Category;
import com.tomignoul.store.model.Product;
import com.tomignoul.store.repository.category.CategoryRepository;
import com.tomignoul.store.repository.product.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    //constructor
    public ProductServiceImpl(ProductRepository productRepository,
                              CategoryRepository categoryRepository){
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
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

    @Override
    public void addProductFromDto(AddProductRequest request){
        //We maken een nieuwe instantie van Product-model
        //vullen die aan met de data uit AddProductRequest DTO
        Product product = new Product();
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        product.setQuantity(request.getQuantity());
        product.setImg(request.getImg());
        Category category = categoryRepository.findById(request.getCategory().getId())
                .orElseThrow(()-> new RuntimeException("Category not found: "));
        product.setCategory(category);
        //slaan deze op
        productRepository.save(product);
    }
}
