package com.project.ewa.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Product_Details")
public class Product {
    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "product_name")
    private String name;

    @Column(name = "product_description")
    private String description;

    @Column(name = "product_price")
    private double price;

    @Column(name = "product_image")
    private String image;

    @Column(name = "product_specification")
    private String specification;

    @Column(name = "product_brand")
    private String brand;

//    @ManyToOne
//    @JoinColumn(name = "category_id")
//    private Category category;
//    
//    @ManyToOne
//    @JoinColumn(name = "cart_id")
//    private Cart cart;
//    

}
