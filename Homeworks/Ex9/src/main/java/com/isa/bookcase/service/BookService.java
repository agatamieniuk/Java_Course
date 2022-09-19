package com.isa.bookcase.service;

import com.isa.bookcase.dto.BookForm;
import com.isa.bookcase.entities.AuthorEntity;
import com.isa.bookcase.entities.BookEntity;
import com.isa.bookcase.model.Category;
import com.isa.bookcase.repository.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private Dao<BookEntity> bookDao;

    public BookService(Dao<BookEntity> bookDao) {
        this.bookDao = bookDao;
    }

    public Collection<BookEntity> getAllBooks() {
        return bookDao.findAll();
    }

    public List<Category> getBookCategories() {
        return Arrays.asList(Category.values());
    }

    @Transactional
    public void addBook(BookForm bookForm) {
        BookEntity book = new BookEntity();
        AuthorEntity author = new AuthorEntity();
        author.setAuthor(bookForm.getAuthor());

        book.setTitle(bookForm.getTitle());
        book.setCategory(bookForm.getCategory());
        book.setPages(bookForm.getPages());
        book.setForKids(bookForm.isForKids());
        book.setAuthor(author);
        bookDao.save(book);
        System.out.println(book);
    }
}
