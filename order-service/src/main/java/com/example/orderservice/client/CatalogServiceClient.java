
package com.example.orderservice.client;

import com.example.orderservice.vo.ResponseCatalog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="catalog-service", url="52.20.91.194:8000")
public interface CatalogServiceClient {

    @GetMapping("/catalogs/{productId}")
    ResponseCatalog getCatalog(@PathVariable String productId);

}