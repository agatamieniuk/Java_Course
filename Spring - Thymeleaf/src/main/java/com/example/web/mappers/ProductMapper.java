package com.example.web.mappers;

import com.example.web.dto.ProductDto;
import com.example.web.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public ProductDto toDto(Product product) {
        ProductDto dto = new ProductDto();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setDesc(product.getDesc());
        dto.setCreated(product.getCreated());
        dto.setColor(product.getColor());
        dto.setEcommerce(product.getEcommerce());
        dto.setElements(product.getElements());
        return dto;
    }

    public Product toEntity(ProductDto product) {
        Product entity = new Product();
        entity.setId(product.getId());
        entity.setName(product.getName());
        entity.setDesc(product.getDesc());
        entity.setCreated(product.getCreated());
        entity.setColor(product.getColor());
        entity.setEcommerce(product.getEcommerce());
        entity.setElements(product.getElements());
        return entity;
    }
}