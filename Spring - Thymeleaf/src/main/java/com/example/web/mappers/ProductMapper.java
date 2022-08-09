package com.example.web.mappers;

import com.example.web.dto.ProductDto;
import com.example.web.dto.ProductElementDto;
import com.example.web.entity.Product;
import com.example.web.entity.ProductElement;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

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
        List<ProductElementDto> productElements = product.getElements().stream()
                .map(entity -> {
                    ProductElementDto element = new ProductElementDto();
                    element.setId(entity.getId());
                    element.setName(entity.getName());
                    return element;
                }).collect(Collectors.toList());
        dto.setElements(productElements);
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
        List<ProductElement> productElements = product.getElements().stream()
                .map(dto -> {
                    ProductElement element = new ProductElement();
                    element.setId(dto.getId());
                    element.setName(dto.getName());
                    return element;
                }).collect(Collectors.toList());
        entity.setElements(productElements);
        return entity;
    }
}