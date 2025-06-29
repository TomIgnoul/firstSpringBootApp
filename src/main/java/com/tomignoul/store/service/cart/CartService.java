package com.tomignoul.store.service.cart;

import com.tomignoul.store.dto.AddToCartRequest;
import com.tomignoul.store.model.Cart;

public interface CartService {
    void addCart(AddToCartRequest request);
}
