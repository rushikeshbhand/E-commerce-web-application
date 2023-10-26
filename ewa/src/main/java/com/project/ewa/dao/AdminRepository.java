package com.project.ewa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.ewa.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
	Admin findAdminById(Long id);
}
