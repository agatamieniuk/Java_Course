package com.infoshareacademy.controller;

import com.infoshareacademy.domain.Book;
import com.infoshareacademy.repository.Books;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class FindBook {

    @GetMapping("/book/{title}/search")
    @ResponseBody
    public List<Book> findByTitle(@PathVariable String title, Books books) {

        List<Book> collect = books.getBooks().stream().
                filter(t -> t.getTitle().toLowerCase()
                .contains(title.toLowerCase()))
                .collect(Collectors.toList());
        return collect;
    }
}
