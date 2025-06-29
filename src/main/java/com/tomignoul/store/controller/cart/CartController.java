//Class is responsible for routes with /cart/...
//  Manage the requests (JSON data)
//  Call the correct service to do something with the received data

package com.tomignoul.store.controller.cart;

import com.tomignoul.store.dto.AddToCartRequest;
import com.tomignoul.store.model.Cart;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {
    @PostMapping("/add") //post naar /cart/add
    public ResponseEntity<?>addToCart(@RequestBody AddToCartRequest request){
        return ResponseEntity.ok("Item added to cart!");
    }
    public CartController(){}
}
