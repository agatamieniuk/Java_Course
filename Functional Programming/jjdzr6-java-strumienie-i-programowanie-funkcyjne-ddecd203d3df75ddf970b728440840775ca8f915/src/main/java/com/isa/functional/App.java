package com.isa.functional;

import com.isa.functional.myfunctions.MyFirstFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("App");

        //stworzenie funkcji z Interface'u MyFirstFunction (implementacja interfaceu)
        MyFirstFunction<String, Integer> myFirstFunction = new MyFirstFunction<String, Integer>() { //new na Interface tworzy klasę anonimową
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        //to samo, co powyżej zapisane za pomocą Lambdy
        MyFirstFunction<String, Integer> myFirstFunction2 = s -> s.length(); //na Stringu s zostaje wywołana metoda s.lenght();
        Integer x = myFirstFunction2.apply("Ala ma kota");//<=uzycie funkcji (nasz Intiger, ktory zwracamy)
        logger.info("Nasz integer: " + x);

        MyFirstFunction<String, String> mySecondFunction = s -> s + " drugi string";
        String y = mySecondFunction.apply("Parametr zawierajacy pierwszy string i");
        logger.info(y);

    }
}
