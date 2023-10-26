package com.project.ewa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.ewa.entities.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
	Cart findByCartId(Long id);
}
