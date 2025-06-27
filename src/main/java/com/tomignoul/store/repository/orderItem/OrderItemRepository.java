package com.tomignoul.store.repository.orderItem;

import com.tomignoul.store.model.OrderItem;
import org.hibernate.query.criteria.JpaFetchParent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
