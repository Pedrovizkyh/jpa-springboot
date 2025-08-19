package com.estudo.jpa.hibernate.repositories;

import com.estudo.jpa.hibernate.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
