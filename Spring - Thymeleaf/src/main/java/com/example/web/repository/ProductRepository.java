package com.example.web.repository;

import com.example.web.entity.Product;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
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
        shirt.setColor("Black");
        shirt.setEcommerce(true);
        save(shirt);

        Product sweatshirt = new Product();
        sweatshirt.setName("Sweatshirt");
        sweatshirt.setDesc("Use this area to describe your product. Lorem ipsum dolor sit amet.");
        sweatshirt.setCreated(LocalDate.now().plusDays(1));
        sweatshirt.setColor("Black");
        sweatshirt.setEcommerce(false);
        save(sweatshirt);

        Product sweatpants = new Product();
        sweatpants.setName("Sweatpants");
        sweatpants.setDesc("Use this area to describe your product. Lorem ipsum dolor sit amet.");
        sweatpants.setCreated(LocalDate.now().plusDays(2));
        sweatpants.setColor("White");
        sweatpants.setEcommerce(false);
        save(sweatpants);

    }

    @Override
    Integer nextId() {
        return nextId.getAndIncrement();
    }
}
