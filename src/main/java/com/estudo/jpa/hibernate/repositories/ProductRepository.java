package com.estudo.jpa.hibernate.repositories;

import com.estudo.jpa.hibernate.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
