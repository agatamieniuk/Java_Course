package com.isa.functional.myfunctions;

@FunctionalInterface
public interface MyProducer<T> {
    T apply();
}