package com.isa.bookcase.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "author")
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column
    private Long id;

    @Column
    private String author;

    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<BookEntity> book;

    public AuthorEntity(String author) {
        this.author = author;
    }


    public AuthorEntity() {
    }

    public List<BookEntity> getBook() {
        return book;
    }

    public void setBook(List<BookEntity> book) {
        this.book = book;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return author;
    }
}
