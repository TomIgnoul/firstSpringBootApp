package com.tomignoul.store.service.customerOrder;

import com.tomignoul.store.model.CustomerOrder;
import com.tomignoul.store.repository.customerOrder.CustomerOrderRepository;

public class CustomerOrderServiceImpl implements CustomerOrderService {
    private final CustomerOrderRepository customerOrderRepository;

    //constructor
    public CustomerOrderServiceImpl(CustomerOrderRepository customerOrderRepository){
        this.customerOrderRepository = customerOrderRepository;
    }

    @Override
    public void addCustomerOrder(CustomerOrder customerOrder) {
        customerOrderRepository.save(customerOrder);
    }
}
