package com.isa.functional.myfunctions;

@FunctionalInterface
public interface MyConsumer<T> {
    void apply(T t);
}
