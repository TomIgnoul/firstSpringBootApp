package com.tomignoul.store.service.cart;

import com.tomignoul.store.model.Cart;
import com.tomignoul.store.model.OrderItem;
import com.tomignoul.store.repository.cart.CartRepository;

public class CartServiceImpl implements CartService{
    private CartRepository cartRepository;

    //constructor
    public CartServiceImpl(CartRepository cartRepository){
        this.cartRepository=cartRepository;
    }

    @Override
    public void addCart(Cart cart){
        cartRepository.save(cart);
    }
}
