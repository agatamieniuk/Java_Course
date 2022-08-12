package com.example.web.controller;

import com.example.web.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("products")
public class ProductController {

    @GetMapping("model/{id}")
    public String getProduct(@PathVariable Long id, @RequestParam(required = false, name = "name", defaultValue = "koszulka")String name,
                             Model model){
        ProductDto productDto = createProduct(id, name);
        model.addAttribute("product", productDto); //pierwsze to nazwa nadana przez nas (ktora musi byc zgodna z tym co jest w Thymeleafowym odnosniku(!) np.<h2 th:text="'Product [id=' + ${product.id} + ']'"></h2>,
                                                                // drugie to wartosc zmiennej ktora chcemy pobrac/wyswietlic
        model.addAttribute("title", "Model product Page");
        return "product";
    }

    private ProductDto createProduct(Long id, String name){
        ProductDto productDto = new ProductDto();
        productDto.setId(id);
        productDto.setName(name);
        return productDto;
    }
}
