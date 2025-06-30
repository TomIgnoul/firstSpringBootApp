package com.tomignoul.store.service.cart;

import com.tomignoul.store.model.Cart;
import com.tomignoul.store.model.User;
import com.tomignoul.store.repository.cart.CartRepository;

public class CartServiceImpl implements CartService {
    private final CartRepository cartRepository;

    // Constructor
    public CartServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    // Interne helperfunctie
    public Cart getOrCreateCartForUser(User user) {
        return cartRepository.findByUser(user)
                .orElseGet(() -> {
                    Cart newCart = new Cart();
                    newCart.setUser(user);
                    return cartRepository.save(newCart);
                });
    }
}
