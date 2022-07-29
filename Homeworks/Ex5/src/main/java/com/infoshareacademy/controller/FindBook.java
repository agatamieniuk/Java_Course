package com.infoshareacademy.controller;

import com.infoshareacademy.domain.Book;
import com.infoshareacademy.repository.Books;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FindBook {

    @GetMapping("/book/{title}/search")
    public List<Book> findByTitle(@PathVariable String title, Books books) {
        return books.titleSearch(title);
    }
}
