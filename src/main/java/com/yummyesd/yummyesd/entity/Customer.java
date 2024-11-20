package com.yummyesd.yummyesd.entity;


import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    @Column(name = "First_Name", nullable = false)
    private String firstName;

    @Column(name = "Last_Name", nullable = true)
    private String lastName;

    @Column(name = "Age", nullable = true)
    private int age;

    @Column(name = "email_id", nullable = false)
    private String emailId;

    @Column(name = "Password", nullable = false)
    private String password;

}
