package com.isa.functional;

import com.isa.functional.myfunctions.MyConsumer;
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

        MyConsumer<String> myConsumer = s-> logger.info(s);
        myConsumer.apply("Hej");
    }
}
