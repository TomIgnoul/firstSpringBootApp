package com.tomignoul.store.service.cart;

import com.tomignoul.store.dto.AddToCartRequest;
import com.tomignoul.store.model.Cart;
import com.tomignoul.store.model.User;

public interface CartService {
//    void addCart(AddToCartRequest request);
    Cart getOrCreateCartForUser(User user);
}
