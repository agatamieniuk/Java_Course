package com.isa.bookcase.entities;

import com.isa.bookcase.model.Category;
import javax.persistence.*;

@Entity
@Table(name = "book")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Category category;

    @Column
    private int pages;

    @Column
    private boolean forKids;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    private AuthorEntity author;

    public BookEntity() {
    }

    public BookEntity(String title, Category category, int pages, boolean forKids, AuthorEntity author) {
        this.title = title;
        this.category = category;
        this.pages = pages;
        this.forKids = forKids;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isForKids() {
        return forKids;
    }

    public void setForKids(boolean forKids) {
        this.forKids = forKids;
    }

    public AuthorEntity getAuthor() {
        return author;
    }

    public void setAuthor(AuthorEntity author) {
        this.author = author;
    }

}
