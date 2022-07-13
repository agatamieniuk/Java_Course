package model;

import menu.DrinkMenu;
import service.Order;

import java.util.Objects;

public class Drink extends Order {
    private DrinkMenu drink;

    public Drink() {
    }

    public Drink(DrinkMenu drink, int howMany) {
        this.drink = drink;
        this.setHowMany(howMany);
        setPrice(drinkPrice(drink, howMany));
    }

    private double drinkPrice(DrinkMenu drink, int howMany) {
        if (drink.equals(DrinkMenu.COLA)) {
            setPrice(10 * howMany);
        } else if(drink.equals(DrinkMenu.SOK)){
            setPrice(12 * howMany);
        } else {
            setPrice(15 * howMany);
        }
        return getPrice();
    }

    @Override
    public String toString() {
        return "Zamówienie: " +
                "Napój " + drink +
                ", ilość=" + getHowMany() +
                ", cena(napoje)=" + getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Drink drink1 = (Drink) o;
        return drink == drink1.drink;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), drink);
    }
}