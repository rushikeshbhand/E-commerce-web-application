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
import javax.persistence.OneToOne; 
import javax.persistence.Table;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Payment_Details")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Long id;

    @Column(name = "payment_date")
    private String paymentDate;

    @Column(name = "payment_amount")
    private double paymentAmount;

    @Column(name = "payment_status")
    private String paymentStatus;

    @Column(name = "payment_method")
    private String paymentMethod;

//    @OneToOne // Use OneToOne since it's a one-to-one relationship
//    @JoinColumn(name = "order_id") // Define the foreign key column
//    private Order order;
//    
//    @ManyToOne
//    @JoinColumn(name = "customer_id") 
//    private Customer customer;

}
