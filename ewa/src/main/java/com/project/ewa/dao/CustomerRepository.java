package com.project.ewa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.ewa.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByCustomerId(Long id);
}
