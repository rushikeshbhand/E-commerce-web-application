package com.project.ewa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Cart_Details")
public class Cart {
    @Id
    @Column(name = "cart_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;

    @NotNull
    @Column(name = "product_quantity")
    private int quantity;

    @Column(name = "total_price")
    private double totalPrice;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    /*
    @OneToMany(mappedBy = "cart")
    private List<Product> products; // Use a List to store multiple Product entities

    // Add the following relationships for one-to-one relationships with Order and Customer
    @OneToOne(mappedBy = "cart")
    private Order order;
    */

    
}
