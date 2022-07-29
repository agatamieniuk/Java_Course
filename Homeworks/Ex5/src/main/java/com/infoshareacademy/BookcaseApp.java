package com.infoshareacademy;

import com.infoshareacademy.domain.Book;
import com.infoshareacademy.repository.Books;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class BookcaseApp {

    public static void main(String[] args) {
        SpringApplication.run(BookcaseApp.class, args);


    }


}
