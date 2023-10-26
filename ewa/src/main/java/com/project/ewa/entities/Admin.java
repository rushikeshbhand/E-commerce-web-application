package com.project.ewa.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@Entity
@Table(name="Admin_Details")
public class Admin {
	@Id
	@Column(name="admin_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Column(name="Admin_username")
	private String username;

	@NotBlank
	@Column(name="Admin_password")
	private String password;
	
	@Column(name="Amin_email")
	private String email;
	
	@Column(name="Admin_ContactNumber")
	private int contact;

}
