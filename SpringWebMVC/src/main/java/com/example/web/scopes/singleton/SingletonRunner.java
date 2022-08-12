package com.example.web.scopes.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @see org.springframework.boot.CommandLineRunner jest wywoływany po uruchomieniu aplikacji.
 * Nie zalecam wykorzystywać go do tworzenia aplikacji webowych.
 * Jednak nam posłuży jako łatwy sposób na uruchomienie kodu.
 */
@Component
public class SingletonRunner implements CommandLineRunner {

    private final SingletonServiceOne serviceOne;
    private final SingletonServiceTwo serviceTwo;

    @Autowired
    public SingletonRunner(SingletonServiceOne serviceOne, SingletonServiceTwo serviceTwo) {
        this.serviceOne = serviceOne;
        this.serviceTwo = serviceTwo;
    }

    @Override
    public void run(String... args) {
        System.out.println(serviceOne.toString());
        System.out.println(serviceTwo.toString());
    }
}