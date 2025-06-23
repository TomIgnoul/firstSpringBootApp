package com.tomignoul.store;

import com.tomignoul.store.tutorial.OrderService;
import com.tomignoul.store.tutorial.PayPalPaymentService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
