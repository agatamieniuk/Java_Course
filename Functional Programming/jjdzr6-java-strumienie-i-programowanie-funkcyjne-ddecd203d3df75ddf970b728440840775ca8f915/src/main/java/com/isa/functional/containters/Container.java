package com.isa.functional.containters;

public class Container <T>{
    private final T value;

    public Container(T value) {
        this.value = value; //<-final, bo w programowaniu funkcyjnym dane mają być niezmienne
    }

    public T getValue() {
        return value;
    }
}
