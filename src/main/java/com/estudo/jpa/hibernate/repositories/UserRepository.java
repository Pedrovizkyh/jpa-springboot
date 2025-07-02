package com.estudo.jpa.hibernate.repositories;

import com.estudo.jpa.hibernate.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
