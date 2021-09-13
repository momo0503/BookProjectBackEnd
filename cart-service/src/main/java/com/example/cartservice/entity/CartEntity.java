package com.example.cartservice.entity;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name="cart")
public class CartEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 120, unique = true)
    private String productId;
    @Column(length = 120)
    private String productName;
    @Column(length = 120)
    private String userId;
    @Column(length = 120)
    private Integer stock;
    @Column(length = 120)
    private Integer unitPrice;
    @Column(length = 120)
    private String imageUrl;

    @Column(nullable = false, updatable = false, insertable = false)
    @ColumnDefault(value="CURRENT_TIMESTAMP")
    private Date createdAt;
}
