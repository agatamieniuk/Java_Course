package com.infoshareacademy.controller;

import com.infoshareacademy.domain.Book;
import com.infoshareacademy.repository.Books;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class Bookcase {

    @GetMapping("/books")
    @ResponseBody
    public List<Book> seeAllBooks(Books books){
        return books.getBooks();
    }
}
