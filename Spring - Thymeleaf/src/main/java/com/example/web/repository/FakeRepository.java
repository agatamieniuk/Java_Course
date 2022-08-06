package com.example.web.repository;

import com.example.web.entity.Entity;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class FakeRepository<T, E extends Entity<T>> {
    private final Map<T, E> fakeDb = new ConcurrentHashMap<>();

    public void save(E entity) {
        T id = entity.getId();
        if (id == null) {
            entity.setId(nextId());
        }
        fakeDb.put(entity.getId(), entity);
    }

    public E findById(T id) {
        return fakeDb.get(id);
    }

    abstract T nextId();

}
