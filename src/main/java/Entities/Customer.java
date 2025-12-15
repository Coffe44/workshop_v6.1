package Entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "T_CUSTOMER")
public class Customer
{
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUST_ID")
    private long id;

    @Column(name = "CUST_FIRST_NAME", nullable = false, length = 100)
    private String FirstName;

    @Column(name = "CUST_LAST_NAME", nullable = false, length = 100)
    private String LastName;

    @Column(name = "EMAIL_ADDR", nullable = false,unique = true, length = 100)
    private String email;

    @Column(name = "CREATED_AT", nullable = false, updatable = false, insertable = false)
    private LocalDateTime createdAt;
}
