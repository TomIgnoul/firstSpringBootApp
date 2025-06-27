package com.tomignoul.store.repository.customerOrder;

import com.tomignoul.store.model.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Long> {

}
