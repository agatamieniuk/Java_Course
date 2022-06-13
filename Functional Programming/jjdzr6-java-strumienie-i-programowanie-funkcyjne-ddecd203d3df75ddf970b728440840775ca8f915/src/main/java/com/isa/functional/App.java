package com.isa.functional;

import com.isa.functional.containters.Container;
import com.isa.functional.myfunctions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("App");

        //zamiast petli FOR
        List<String> myList = new ArrayList<>(); //tworze liste
        myList.add("A");
        myList.add("Aa");
        myList.add("Aaa");

        List<Integer> myIntList = myList.stream().map(s -> s.length()).collect(Collectors.toList());//zamieniam mape na stream
        //Collect(Collectors.toList()) <=zwija streama spowrotem do listy
        // (ale dostajemy poprzez operacje liste Integerow)
        logger.info(myIntList.toString());

        //zamiast ifa - FILTR:
        List<Integer> tylkoParzysteSlowa = myList
                .stream()//robie streama z listy
                .map(s -> s.length()) //uzywam mapy zeby zmienic COS na COS INNEGO
                .filter(s -> s % 2 == 0) //Filtruje ją - jako IF
                .collect(Collectors.toList()); //zwijan streama spowrotem do listy
        logger.info(tylkoParzysteSlowa.toString());

    }
}