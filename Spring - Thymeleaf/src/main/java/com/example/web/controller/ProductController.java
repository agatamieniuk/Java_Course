package com.example.web.controller;

import com.example.web.dto.ProductDto;
import com.example.web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("{id}")
    public String getProduct(@PathVariable Integer id, Model model) {
        model.addAttribute("product", productService.find(id));
        return "product";
    }

    @GetMapping
    public String getProducts(Model model) {
        model.addAttribute("products", productService.findAll());
        return "products";
    }

    @GetMapping("new")
    public String getProductForm(Model model) {
        model.addAttribute("product", new ProductDto());
        return "product-form";
    }

    @PostMapping(value = "new")
    public String sendProduct(@Valid @ModelAttribute("product") ProductDto product,
                              BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "product-form";
        }
        productService.create(product);

        return "product-form-success";
    }

    @PostMapping(value = "new", params = {"addElement"})
    public String addElement(@ModelAttribute("product") ProductDto product) {
        product.addElement("");
        return "product-form";
    }

    @PostMapping(value = "new", params = {"removeElement"})
    public String removeElement(@ModelAttribute("product") ProductDto product,
                                HttpServletRequest request) {
        int index = Integer.parseInt(request.getParameter("removeElement"));
        product.getElements().remove(index);
        return "product-form";
    }
}