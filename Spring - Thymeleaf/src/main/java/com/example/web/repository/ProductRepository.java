package com.example.web.repository;

import com.example.web.entity.Product;
import com.example.web.enums.Color;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class ProductRepository extends FakeRepository<Integer, Product> {

    private final AtomicInteger nextId = new AtomicInteger(1);

    @PostConstruct
    public void initDb() {
        Product shirt = new Product();
        shirt.setName("Shirt");
        shirt.setDesc("Use this area to describe your product. Lorem ipsum dolor sit amet.");
        shirt.setCreated(LocalDate.now());
        shirt.setColor(Color.BLACK);
        shirt.setEcommerce(true);
        shirt.setElements(new LinkedList<>(List.of("Linen", "Cotton")));
        save(shirt);

        Product sweatshirt = new Product();
        sweatshirt.setName("Sweatshirt");
        sweatshirt.setDesc("Use this area to describe your product. Lorem ipsum dolor sit amet.");
        sweatshirt.setCreated(LocalDate.now().plusDays(1));
        sweatshirt.setColor(Color.BLACK);
        sweatshirt.setEcommerce(false);
        sweatshirt.setElements(new LinkedList<>(List.of("Cotton", "Polyester")));
        save(sweatshirt);

        Product sweatpants = new Product();
        sweatpants.setName("Sweatpants");
        sweatpants.setDesc("Use this area to describe your product. Lorem ipsum dolor sit amet.");
        sweatpants.setCreated(LocalDate.now().plusDays(2));
        sweatpants.setColor(Color.WHITE);
        sweatpants.setEcommerce(false);
        sweatpants.setElements(new LinkedList<>(List.of("Linen", "Cotton")));
        save(sweatpants);

    }

    @Override
    Integer nextId() {
        return nextId.getAndIncrement();
    }
}