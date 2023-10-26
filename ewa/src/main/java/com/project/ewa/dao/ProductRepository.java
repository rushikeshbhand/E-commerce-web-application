package com.project.ewa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.ewa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByProductId(Long id);
}