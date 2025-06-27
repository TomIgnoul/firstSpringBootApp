package com.tomignoul.store.service.orderItem;

import com.tomignoul.store.model.OrderItem;
import com.tomignoul.store.repository.orderItem.OrderItemRepository;

public class OrderItemServiceImpl implements OrderItemService{
    private final OrderItemRepository orderItemRepository;

    //constructor
    public OrderItemServiceImpl(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    @Override
    public void addOrderItem(OrderItem orderItem){
        orderItemRepository.save(orderItem);
    }



}
