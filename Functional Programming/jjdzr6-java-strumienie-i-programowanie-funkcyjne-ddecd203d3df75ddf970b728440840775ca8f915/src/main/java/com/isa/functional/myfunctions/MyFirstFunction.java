package com.isa.functional.myfunctions;

@FunctionalInterface
public interface MyFirstFunction<T, R> {
    R apply(T t);

    static Integer getSecretNumber() { //metoda statyczna w Interface
        return 1;
    }
    default Integer add(Integer a, Integer b) { //utworzenie metody defaultowej - moze byc tylko JEDNA na interface  (nie trzeba jej implementowac bo juz jest zaimplementowana)
        return a + b;
    }
}
