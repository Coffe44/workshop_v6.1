package Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "T_PRODUCT")
public class Product
{
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PROD_ID")
    private long id;

    @Column(name = "PROD_NAME", nullable = false , length = 150)
    private String name;

    @Column(name = "PROD_DESC", length = 500)
    private String description;

    @Column(name = "UNIT_PRICE_CENTS", nullable = false)
    private int unitPrice;

    @Column(name = "ACTIVE_FLAG", nullable = false , length = 1)
    private String activeFlag;
}
