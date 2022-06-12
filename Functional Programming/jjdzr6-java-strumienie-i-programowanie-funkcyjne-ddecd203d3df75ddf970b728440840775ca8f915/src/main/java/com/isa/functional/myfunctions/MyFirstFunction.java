package com.isa.functional.myfunctions;

@FunctionalInterface
public interface MyFirstFunction<T, R> { //T - parametr, R - dane zwracane

    R apply(T t); //funkcja przyjmuje parametr T, zwraca R i aplikuje jakieś działanie
}
