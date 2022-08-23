package com.example.security.repository;

import com.example.security.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    Set<Order> findByUsername(String username);
}
