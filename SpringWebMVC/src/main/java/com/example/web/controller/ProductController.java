package com.example.web.controller;

import com.example.web.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("products")
public class ProductController {

    @GetMapping("model/{id}")
    public String getProductModel(@PathVariable Long id,
                                  @RequestParam(required = false, name = "text", defaultValue = "cool t-shirt") String name,
                                  Model model) {
        ProductDto productDto = createProduct(id, name);
        model.addAttribute("product", productDto);
        model.addAttribute("title", "Model Product Page");
        return "product";
    }

    @GetMapping("model-map/{id}")
    public String getProductModelMap(@PathVariable Long id,
                                     @RequestParam(required = false, name = "text", defaultValue = "cool t-shirt") String name,
                                     ModelMap map) {
        ProductDto productDto = createProduct(id, name);
        map.addAttribute("product", productDto);
        map.addAttribute("title", "ModelMap Product Page");
        return "product";
    }

    @GetMapping("model-and-view/{id}")
    public ModelAndView getProductModelAndView(@PathVariable Long id,
                                               @RequestParam(required = false, name = "text", defaultValue = "cool t-shirt") String name) {
        ProductDto productDto = createProduct(id, name);
        ModelAndView modelAndView = new ModelAndView("product");
        modelAndView.addObject("product", productDto);
        modelAndView.addObject("title", "ModelAndView Product Page");
        return modelAndView;
    }

    private ProductDto createProduct(Long id, String name) {
        ProductDto productDto = new ProductDto();
        productDto.setId(id);
        productDto.setName(name);
        return productDto;
    }
}