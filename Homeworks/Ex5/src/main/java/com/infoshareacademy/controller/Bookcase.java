package com.infoshareacademy.controller;

import com.infoshareacademy.domain.Book;
import com.infoshareacademy.repository.Books;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Bookcase {

    @GetMapping("/books")
    public List<Book> seeAllBooks(Books books){
        return books.getBooks();
    }
}
