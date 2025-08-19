package com.estudo.jpa.hibernate.repositories;

import com.estudo.jpa.hibernate.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
