package com.example.userservice.client;

import com.example.userservice.error.FeignErrorDecoder;
import com.example.userservice.vo.ResponseOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

// order-service -> http://127.0.0.1:50002/{userId}/orders
@FeignClient(name = "order-service", configuration = FeignErrorDecoder.class, url="http://localhost:8000")
public interface OrderServiceClient {

    @GetMapping("/order-service/{userId}/orders")
    List<ResponseOrder> getOrders(@PathVariable String userId);

    @GetMapping("/order-service/{userId}/orders_wrong")
    List<ResponseOrder> getOrdersWrong(@PathVariable String userId);
}
