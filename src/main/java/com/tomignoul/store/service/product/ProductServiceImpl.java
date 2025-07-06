package com.tomignoul.store.service.product;

import com.tomignoul.store.dto.product.AddProductRequest;
import com.tomignoul.store.dto.product.SearchProductRequest;
import com.tomignoul.store.model.Category;
import com.tomignoul.store.model.Product;
import com.tomignoul.store.model.User;
import com.tomignoul.store.repository.category.CategoryRepository;
import com.tomignoul.store.repository.product.ProductRepository;
import com.tomignoul.store.repository.user.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final UserRepository userRepository;

    //constructor
    public ProductServiceImpl(ProductRepository productRepository,
                              CategoryRepository categoryRepository,
                              UserRepository userRepository){
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
        this.userRepository = userRepository;
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
        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        product.setQuantity(request.getQuantity());
        product.setImg(request.getImg());
        Category category = categoryRepository.findById(request.getCategory().getId())
                .orElseThrow(()-> new RuntimeException("Category not found: "));
        product.setCategory(category);
        User user = userRepository.findById(request.getUserID())
                .orElseThrow(()-> new RuntimeException("User not found"));
        product.setUser(user);

        //slaan deze op
        productRepository.save(product);
    }

    @Override
    public List<String> searchProducts(SearchProductRequest request){
        List<String> results = new ArrayList<>();
        results.add("Product gevonden: " + request.getKeyword() + " (" + request.getCategory() + ")");
        return results;
    }

}
