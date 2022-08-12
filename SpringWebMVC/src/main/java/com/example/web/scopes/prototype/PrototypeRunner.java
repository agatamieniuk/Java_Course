package com.example.web.scopes.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @see CommandLineRunner jest wywoływany po uruchomieniu aplikacji.
 * Nie zalecam wykorzystywać go do tworzenia aplikacji webowych.
 * Jednak nam posłuży jako łatwy sposób na uruchomienie kodu.
 */
@Component
public class PrototypeRunner implements CommandLineRunner {

    private final PrototypeServiceOne serviceOne;
    private final PrototypeServiceTwo serviceTwo;

    @Autowired
    public PrototypeRunner(PrototypeServiceOne serviceOne, PrototypeServiceTwo serviceTwo) {
        this.serviceOne = serviceOne;
        this.serviceTwo = serviceTwo;
    }

    @Override
    public void run(String... args) {
        System.out.println(serviceOne.toString());
        System.out.println(serviceTwo.toString());
    }
}