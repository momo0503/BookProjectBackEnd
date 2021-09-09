package com.example.cartservice.vo;

import lombok.Data;

@Data
public class RequestCart {
    private String productId;
    private String productName;
    private String userId;
    private String imageUrl;
    private Integer qty;
}


