package com.isa.functional;

import com.isa.functional.myfunctions.MyConsumer;
import com.isa.functional.myfunctions.MyFirstFunction;
import com.isa.functional.myfunctions.MyProducer;
import com.isa.functional.myfunctions.MyTwoParameterFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("App");

        MyProducer<String> myProducer = () -> "nie przyjmuje parametrów";
        String apply = myProducer.apply();
        logger.info(apply);

        MyProducer<String> myProducer2 = () -> LocalDateTime.now().toString();
        String localDate = myProducer2.apply();
        logger.info(localDate);
    }
}
