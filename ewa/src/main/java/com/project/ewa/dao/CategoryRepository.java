package com.project.ewa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.ewa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	Category findByCategoryId(Long id);
}
