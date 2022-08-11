package com.example.web.rest;

import com.example.web.dto.BookDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/products/books")
public class BookRestController {

    @GetMapping("best")
    public BookDto getBestBook(){
        BookDto bookDto = new BookDto();
        bookDto.setIsbn(1);
        bookDto.setTitle("best book");
        return bookDto;
    }

    @GetMapping("novels/{id}")
    public BookDto getBook(@PathVariable("id")Integer id, @RequestParam(required = false, name = "tytul", defaultValue = "ksiazka") String title){
        BookDto bookDto = new BookDto();
        bookDto.setIsbn(id);
        bookDto.setTitle(title);
        return bookDto;
    }
}
