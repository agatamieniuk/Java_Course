package com.example.web.controller;

import com.example.web.dto.ProductDto;
import com.example.web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products/{id}")
    public String getProduct(@PathVariable Integer id, Model model) {
        model.addAttribute("product", productService.find(id));
        return "product";
    }

    @GetMapping("/products")
    public String getProducts(Model model) {
        model.addAttribute("products", productService.findAll());
        return "products";
    }

    @GetMapping("/products/new")
    public String getProductForm(Model model){
        model.addAttribute("product", new ProductDto());
        return "product-form";
    }

    @PostMapping("/products/new")
    public String sendProduct(@ModelAttribute("product") ProductDto product){
        productService.create(product);
        return "product-form-success";

    }
}