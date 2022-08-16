package service;

import model.Burger;
import model.Drink;
import model.Pizza;

import java.util.Objects;

public class Order {
    private int howMany;
    private double price;

    public double totalPrice(Pizza pizza, Burger burger, Drink drink) {
        double totalPrize = pizza.getPrice() + burger.getPrice() + drink.getPrice();
        return totalPrize;
    }

    public double totalPrice(Pizza pizza, Burger burger) {
        double totalPrize = pizza.getPrice() + burger.getPrice();
        return totalPrize;
    }

    public double totalPrice(Pizza pizza, Drink drink) {
        double totalPrize = pizza.getPrice() + drink.getPrice();
        return totalPrize;
    }

    public double totalPrice(Burger burger, Drink drink) {
        double totalPrize = burger.getPrice() + drink.getPrice();
        return totalPrize;
    }

    public int getHowMany() {
        return howMany;
    }

    public void setHowMany(int howMany) {
        this.howMany = howMany;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return howMany == order.howMany && Double.compare(order.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(howMany, price);
    }

}

