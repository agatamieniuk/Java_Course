package com.example.web.rest;

import com.example.web.dto.ProductDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
    public ProductDto getProduct(@PathVariable Long id, @RequestParam(required = false, name = "text", defaultValue = "cool t-shirt") String name) { //chce, zeby w przeglądarce zmienna nie była "name" tylko "tekst" więc podaje w parametrze to słowo
                                //deflaut value - jesli nei bedzie nic podane, to slowo bedzie wartoscia domyślną
                                //required = false -> nie wymagamy kazdego parametru zawartego w nawiasie
        ProductDto productDto = new ProductDto();
        productDto.setId(id);
        productDto.setName(name);
        return productDto;
    }

    @PostMapping("t-shirts")
    @ResponseStatus(HttpStatus.CREATED)
    public ProductDto saveProduct(@RequestBody ProductDto productDto) {
        return productDto;
    }
}
