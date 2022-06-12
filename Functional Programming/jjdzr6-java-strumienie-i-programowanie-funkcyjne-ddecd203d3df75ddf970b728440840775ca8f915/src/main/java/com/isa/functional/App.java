package com.isa.functional;

import com.isa.functional.myfunctions.MyFirstFunction;
import com.isa.functional.myfunctions.MyTwoParameterFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("App");

        MyTwoParameterFunction<Integer, Integer, Integer> myTwoParameterFunction = (a, b) -> a + b; //parametry umieszczamy w nawiasie
        Integer sum = myTwoParameterFunction.apply(2, 3);
        logger.info("Nasza suma: " + sum);


    }
}
