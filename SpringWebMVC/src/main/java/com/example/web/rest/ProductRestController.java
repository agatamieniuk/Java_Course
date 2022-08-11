package com.example.web.rest;

import com.example.web.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {

    @GetMapping("api/products/clothes/best")
    public ProductDto getTheBest(){
        ProductDto productDto = new ProductDto();
        productDto.setId(1L);
        productDto.setName("best product");
        return productDto;
    }
}
