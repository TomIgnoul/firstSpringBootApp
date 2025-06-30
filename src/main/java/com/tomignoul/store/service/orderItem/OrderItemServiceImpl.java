package com.tomignoul.store.service.orderItem;

import com.tomignoul.store.dto.AddToCartRequest;
import com.tomignoul.store.model.Cart;
import com.tomignoul.store.model.OrderItem;
import com.tomignoul.store.model.Product;
import com.tomignoul.store.model.User;
import com.tomignoul.store.repository.orderItem.OrderItemRepository;


import com.tomignoul.store.service.cart.CartService;
import com.tomignoul.store.service.product.ProductService;
import com.tomignoul.store.service.user.UserService;

import java.math.BigDecimal;

public class OrderItemServiceImpl implements OrderItemService {
    private final OrderItemRepository orderItemRepository;
    private final CartService cartService;
    private final UserService userService;
    private final ProductService productService;

    // Constructor
    public OrderItemServiceImpl(OrderItemRepository orderItemRepository,
                                CartService cartService,
                                UserService userService,
                                ProductService productService) {
        this.orderItemRepository = orderItemRepository;
        this.productService = productService;

        this.cartService = cartService;
        this.userService = userService;
    }

    // Function to add product to cart
    public void addToCart(AddToCartRequest request) {
        Product product = productService.requireProductById(request.getProductID());
        User user = userService.requireUserById(request.getUserID());
        Cart cart = cartService.getOrCreateCartForUser(user);

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
