package com.example.web.service;

import com.example.web.dto.ProductDto;
import com.example.web.entity.Product;
import com.example.web.mappers.ProductMapper;
import com.example.web.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    @Autowired
    public ProductService(ProductRepository repository, ProductMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public void create(ProductDto dto) {
        Product product = mapper.toEntity(dto);
        repository.save(product);
    }

    public ProductDto find(Integer id) {
        Product product = repository.findById(id);
        return mapper.toDto(product);
    }
}
