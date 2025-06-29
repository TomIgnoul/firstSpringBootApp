package com.tomignoul.store.repository.cart;

import com.tomignoul.store.model.Cart;
import com.tomignoul.store.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Optional<Cart> findByUser(User user);
}
