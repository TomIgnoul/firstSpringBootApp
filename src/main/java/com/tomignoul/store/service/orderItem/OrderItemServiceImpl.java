package com.tomignoul.store.service.orderItem;

import com.tomignoul.store.dto.AddToCartRequest;
import com.tomignoul.store.model.Cart;
import com.tomignoul.store.model.OrderItem;
import com.tomignoul.store.model.Product;
import com.tomignoul.store.model.User;
import com.tomignoul.store.repository.cart.CartRepository;
import com.tomignoul.store.repository.orderItem.OrderItemRepository;
import com.tomignoul.store.repository.product.ProductRepository;
import com.tomignoul.store.repository.user.UserRepository;

import java.math.BigDecimal;

public class OrderItemServiceImpl implements OrderItemService {
    private final OrderItemRepository orderItemRepository;
    private final ProductRepository productRepository;
    private final UserRepository userRepository;
    private final CartRepository cartRepository;

    // Constructor
    public OrderItemServiceImpl(OrderItemRepository orderItemRepository,
                                ProductRepository productRepository,
                                UserRepository userRepository,
                                CartRepository cartRepository) {
        this.orderItemRepository = orderItemRepository;
        this.productRepository = productRepository;
        this.userRepository = userRepository;
        this.cartRepository = cartRepository;
    }

    // Function to add product to cart
    public void addToCart(AddToCartRequest request) {
        Product product = productRepository.findById(request.getProductID())
                .orElseThrow(() -> new RuntimeException("Product not found with ID: " + request.getProductID()));

        User user = userRepository.findById(request.getUserID())
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + request.getUserID()));

        Cart cart = cartRepository.findByUser(user)
                .orElseGet(() -> {
                    Cart newCart = new Cart();
                    newCart.setUser(user);
                    return cartRepository.save(newCart);
                });
        OrderItem orderItem = new OrderItem();
        orderItem.setProduct(product);
        orderItem.setCart(cart);
        orderItem.setQuantity(request.getQuantity());
        orderItem.setPrice(product.getPrice().multiply(
                new BigDecimal(request.getQuantity()))
        );
        orderItemRepository.save(orderItem);
    }

    @Override
    public void addOrderItem(OrderItem orderItem) {
        orderItemRepository.save(orderItem);
    }
}
