package com.infoshareacademy.controller;

import com.infoshareacademy.domain.Book;
import com.infoshareacademy.repository.Books;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.Random;

@RestController
public class RandomBook {

    @GetMapping("/book-for-today")
    public Book getRandomBook(Books books) {
        Random random = new Random();
        int randomNumber = random.nextInt(books.getBooks().size());
        return books.getBooks().get(randomNumber);
    }
}
