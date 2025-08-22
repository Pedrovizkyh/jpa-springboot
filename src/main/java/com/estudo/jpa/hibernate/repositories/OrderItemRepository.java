package com.estudo.jpa.hibernate.repositories;

import com.estudo.jpa.hibernate.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
