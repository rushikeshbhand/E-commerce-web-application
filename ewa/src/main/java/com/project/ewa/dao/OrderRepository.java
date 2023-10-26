package com.project.ewa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.ewa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findByOrderId(Long id);
}
