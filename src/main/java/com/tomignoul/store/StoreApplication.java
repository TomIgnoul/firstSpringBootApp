package com.tomignoul.store;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//        SpringApplication.run(StoreApplication.class, args);
//        PaymentService paymentService = new StripePaymentService();
//        OrderService orderService = new OrderService(paymentService)
        var orderService = new OrderService(new PayPalPaymentService());
        orderService.placeOrder();
    }

}
