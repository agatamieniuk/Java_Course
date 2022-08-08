package com.isa.functional.containters;

import com.isa.functional.myfunctions.MyFirstFunction;

public class Container<T> {
    private final T value; //<-final, bo w programowaniu funkcyjnym dane mają być niezmienne

    //MAP => zamienia  elementy jedne w drugie
    public <U> Container<U> map(MyFirstFunction<T, U> mapper) {//<=metoda map zwraca nam Container<U> za pomocą metody zawartej w nawiasie,
        return new Container<>(mapper.apply(value));       //  (i tylko ta metoda w nawiasie nas interesuje), tj. chce tu wrzucic funkcje
                                                           //  MyFirstFunction<T,U>(z parametrem T, zwracajacą U) i ta metoda nazywa się mapper
    }

    public Container(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    //FLATMAP => przyjmuje jeden element/jedną wartość a zwraca wiele elementów/wiele wartości
    // uzywane np. przy Liście list (Lista jako parametr i w srodku kilka list jako dane zwracane)
    public <U> Container<U> flatmap(MyFirstFunction<T, Container<U>> mapper) {//jako parametr wejsciowy przyjmie T a zwroci Container<U> czyli kilka U
        return mapper.apply(value);
    }
}
