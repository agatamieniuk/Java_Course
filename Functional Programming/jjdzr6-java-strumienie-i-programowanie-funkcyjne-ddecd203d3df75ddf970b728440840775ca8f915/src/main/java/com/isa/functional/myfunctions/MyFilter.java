package com.isa.functional.myfunctions;
@FunctionalInterface
public interface MyFilter<T> {
    Boolean test(T t);
}
