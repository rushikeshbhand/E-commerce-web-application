package com.project.ewa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.ewa.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Payment findByPaymentId(Long id);
}
