package com.example.catalogservice.service;

import com.example.catalogservice.dto.CatalogDto;
import com.example.catalogservice.jpa.CatalogEntity;

public interface CatalogService {


    CatalogEntity createCatalog(CatalogDto catalogDto);


    Iterable<CatalogEntity> getAllCatalogs();

    CatalogEntity getCatalog(String productId);

    void deleteCatalog(String productId);
}
