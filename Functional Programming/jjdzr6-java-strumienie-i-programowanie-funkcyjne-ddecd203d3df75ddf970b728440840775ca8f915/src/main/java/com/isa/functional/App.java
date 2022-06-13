package com.isa.functional;

import com.isa.functional.containters.Container;
import com.isa.functional.myfunctions.*;
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

        MyFilter<String> myFilter = (mojString -> mojString.length() % 2 == 0);
        boolean czyParzysty = myFilter.test("Hej");
        boolean czyParzysty2 = myFilter.test("He");
        logger.info("Czy parzysty: " + czyParzysty);
        logger.info("Czy parzysty: " + czyParzysty2);

    }
}