package com.isa.bookcase.repository;

import com.isa.bookcase.entities.BookEntity;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class BookDao implements Dao<BookEntity> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public BookEntity find(Long id) {
        return entityManager.find(BookEntity.class, id);
    }

    @Override
    public List<BookEntity> findAll() {
        TypedQuery<BookEntity> query = entityManager.createQuery("SELECT b FROM BookEntity b", BookEntity.class);
        return query.getResultList();
    }

    @Override
    public void save(BookEntity book) {
        entityManager.persist(book);
    }

    @Override
    public BookEntity update(BookEntity book) {
        entityManager.merge(book);
        return book;
    }

    @Override
    public void delete(BookEntity book) {
        if (book != null) {
            entityManager.remove(book);
        }
    }
}
