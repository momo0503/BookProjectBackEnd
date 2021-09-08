package com.example.catalogservice.service;

import com.example.catalogservice.dto.CatalogDto;
import com.example.catalogservice.jpa.CatalogEntity;

public interface CatalogService {


    CatalogEntity createCatalog(CatalogDto catalogDto);


    Iterable<CatalogEntity> getAllCatalogs();

    CatalogEntity getCatalog(String productId);

    void deleteCatalog(String productId);


    /* 카탈로그(상품) 수정 관련*/
    CatalogDto getCatalogByProductId(String productId);
    CatalogDto updateByProductId(CatalogDto catalogDto, CatalogDto catalogDetails);


}
