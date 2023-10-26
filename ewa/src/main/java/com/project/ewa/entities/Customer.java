package com.project.ewa.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "customer_details")
public class Customer {
    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    @NotBlank
    @Column(name = "first_name")
    private String firstName;

    @NotBlank
    @Column(name = "last_name")
    private String lastName;

    @NotBlank
    @Column(name = "email")
    private String email;

    @NotBlank
    @Column(name = "password")
    private String password;

    @NotBlank
    @Column(name = "address")
    private String address;

    @NotBlank
    @Column(name = "phone_no")
    private String phoneNo;
//
//    one-to-many relationship with the Order entity
//    @OneToMany(mappedBy = "customer") // here customer should match the field name in the Order entity
//    private List<Order> orders;

}
