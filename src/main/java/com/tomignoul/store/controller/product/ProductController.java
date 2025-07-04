package com.tomignoul.store.controller.product;


import com.tomignoul.store.dto.product.AddProductRequest;
import com.tomignoul.store.dto.product.SearchProductRequest;
import com.tomignoul.store.service.product.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    //constructor injection
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // testendpoint
    @GetMapping("/")
    public String test() {
        return "App is running";
    }

    @PostMapping("/add")
    public ResponseEntity<?> addProduct(@RequestBody AddProductRequest request) {
        //Spring zal JSON omzetten naar DTO(addProductRequest)
        productService.addProductFromDto(request);
        return ResponseEntity.ok("Product added!");
    }

    @GetMapping("/search")
    public ResponseEntity<String> searchProducts(@ModelAttribute SearchProductRequest request) {
        return ResponseEntity.ok("Search endpoint bereikt!");
    }

}

