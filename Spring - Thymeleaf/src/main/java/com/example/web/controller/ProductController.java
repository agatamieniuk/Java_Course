package com.example.web.controller;

import com.example.web.dto.ProductDto;
import com.example.web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products/{id}")
    public String getWelcome(@PathVariable Integer id, Model model){
        ProductDto productDto = productService.find(id);
        model.addAttribute("product", productDto);
        return "product";
    }
}
