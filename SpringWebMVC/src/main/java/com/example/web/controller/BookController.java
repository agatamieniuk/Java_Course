package com.example.web.controller;

import com.example.web.dto.BookDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("books")
public class BookController {

    @GetMapping("model/{isbn}")
    public String getBookModel(@PathVariable Integer isbn,
                               @RequestParam(required = false, name = "tytul", defaultValue = "ksiazeczka") String title,
                               Model model) {
        model.addAttribute("book", createBook(isbn, title));
        return "book";
    }

    @GetMapping("model-map/{isbn}")
    public String getModelMapBook(@PathVariable Integer isbn,
                                  @RequestParam(required = false, name = "tytul", defaultValue = "hejho") String title,
                                  ModelMap modelMap) {
        modelMap.addAttribute("book", createBook(isbn, title));
        return "book";
    }

    @GetMapping("model-and-view/{isbn}")
    public ModelAndView getModelAndViewBook(@PathVariable Integer isbn, @RequestParam(required = false, name = "text", defaultValue = "ojojoj") String name) {
        ModelAndView modelAndView = new ModelAndView("book");
        modelAndView.addObject("book", createBook(isbn, name));
        return modelAndView;
    }


    private BookDto createBook(Integer isbn, String title) {
        BookDto bookDto = new BookDto();
        bookDto.setIsbn(isbn);
        bookDto.setTitle(title);
        return bookDto;
    }
}
