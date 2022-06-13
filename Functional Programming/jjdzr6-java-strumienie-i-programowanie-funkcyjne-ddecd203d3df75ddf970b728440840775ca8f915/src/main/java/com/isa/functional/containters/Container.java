package com.isa.functional.containters;
import com.isa.functional.myfunctions.MyFirstFunction;

public class Container <T>{
    private final T value; //<-final, bo w programowaniu funkcyjnym dane mają być niezmienne

    //MAP => zamienia  elementy jedne w drugie
    public <U>Container<U> map(MyFirstFunction<T,U> mapper){//<=metoda map zwraca nam Container<U> za pomocą metody zawartej w nawiasie,
        return new Container<>(mapper.apply(value));       //  (i tylko ta metoda w nawiasie nas interesuje), tj. chce tu wrzucic funkcje
                                                           //  MyFirstFunction<T,U>(z parametrem T, zwracajacą U) i ta metoda nazywa się mapper
    }

    public Container(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}
