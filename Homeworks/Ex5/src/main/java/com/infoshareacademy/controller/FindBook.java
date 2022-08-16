package com.infoshareacademy.controller;

import com.infoshareacademy.domain.Book;
import com.infoshareacademy.repository.Books;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class FindBook {

    @GetMapping("/book/{title}/search")
    public List<Book> findByTitle(@PathVariable String title, Books books) {
        return books.titleSearch(title);
    }
}
