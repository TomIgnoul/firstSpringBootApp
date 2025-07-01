package com.tomignoul.store.controller.product;


import com.tomignoul.store.dto.AddProductRequest;
import com.tomignoul.store.service.product.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    //constructor injection
    public ProductController (ProductService productService){
        this.productservice = productService;
    }
    //post endpoint
    @PostMapping("/add")
    public ResponseEntity<?> addProduct(@RequestBody AddProductRequest request){

        //Spring zal JSON omzetten naar mijn DTO(addProductRequest)
        productService.addProductRequest(request);
        return ResponseEntity.ok("Product added!");
    }
    public ProductController(){};
}
