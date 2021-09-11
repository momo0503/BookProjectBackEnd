package com.example.catalogservice.service;

import com.example.catalogservice.dto.CatalogDto;
import com.example.catalogservice.jpa.CatalogEntity;

import java.util.Date;

public interface CatalogService {


    CatalogEntity createCatalog(CatalogDto catalogDto);


    Iterable<CatalogEntity> getAllCatalogs();

    CatalogEntity getCatalog(String productId);
    Iterable<CatalogEntity> getByCatalogsBetween(String start, String end);
    Iterable<CatalogEntity> getCatalogsByProductName(String name);
    void deleteCatalog(String productId);


    /* 카탈로그(상품) 수정 관련*/
    CatalogDto getCatalogByProductId(String productId);
    CatalogDto updateByProductId(CatalogDto catalogDto, CatalogDto catalogDetails);


}
