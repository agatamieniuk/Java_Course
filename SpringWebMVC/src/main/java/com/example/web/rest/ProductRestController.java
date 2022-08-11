package com.example.web.rest;

import com.example.web.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products/clothes")
public class ProductRestController {

    @GetMapping("best")
    public ProductDto getTheBest(){
        ProductDto productDto = new ProductDto();
        productDto.setId(1L);
        productDto.setName("best product");
        return productDto;
    }

    @GetMapping("t-shirts/{id}")
    public ProductDto getProduct(@PathVariable Long id) { //nazwa jak nazwa zmiennej z klasy Product
        ProductDto productDto = new ProductDto();
        productDto.setId(id);
        productDto.setName("cool t-shirt");
        return productDto;
    }
}
