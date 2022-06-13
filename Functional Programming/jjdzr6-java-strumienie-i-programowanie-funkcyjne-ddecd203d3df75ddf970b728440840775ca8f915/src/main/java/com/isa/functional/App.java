package com.isa.functional;

import com.isa.functional.containters.Container;
import com.isa.functional.myfunctions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("App");

        String x = null;
        Optional<String> mabyeX = Optional.ofNullable(x);
        Optional<Integer> mabyeInteger = mabyeX.map(value -> value.length());
        logger.info(mabyeX.toString()); //=<pokazuje empty bo Optional usunął nulla
        logger.info(mabyeInteger.toString());
        String y = "Agat";
        Optional<String> mabyeY = Optional.ofNullable(y);
        logger.info(mabyeY.toString());//podal wartosc Optional[Agata]

        Optional<Integer> mabyeInteger2 = mabyeY
                .map(value -> value.length())
                .filter(value->value%2==0);
        logger.info(mabyeInteger2.toString());
        logger.info(mabyeInteger2.orElse(0) + " "); //zwroc mi wartosc a jesli jej nie ma orElse(), zwroc mi zero
        logger.info(mabyeInteger2.orElseGet(()->0).toString());// to samo co wyzej tylko zapisane przez lambde

    }
}