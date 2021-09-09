package com.example.cartservice.service;

import com.example.cartservice.dto.CartDto;
import com.example.cartservice.entity.CartEntity;

public interface CartService {
    Iterable<CartEntity> getAllCarts();

    Iterable<CartEntity> getCartsByUserId(String userId);

    CartDto createCart(CartDto cartDto);

    void deleteCart(String userId);

//    CartDto getCartByUserId(String userId);
//
//    void updateByProductId(CartDto cartDto, CartDto cartDetails);
    //Iterable<CartEntity> getCartByUserId(String userId);
}
