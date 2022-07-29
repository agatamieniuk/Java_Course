package model;

import menu.PizzaMenu;
import menu.PizzaSize;
import service.Order;

import java.util.Objects;

public class Pizza extends Order {
    private PizzaMenu pizzaType;
    private PizzaSize pizzaSize;

    public Pizza() {
    }

    public Pizza(PizzaMenu pizzaType, PizzaSize pizzaSize, int howMany) {
        this.pizzaType = pizzaType;
        this.pizzaSize = pizzaSize;
        this.setHowMany(howMany);
        setPrice(pizzaPrice(pizzaType, pizzaSize, getHowMany()));
    }

    private double pizzaPrice(PizzaMenu pizzaType, PizzaSize pizzaSize, int howMany) {
        if (pizzaSize.equals(PizzaSize.MAŁA)) {
            setPrice(10 * howMany);
        } else if (pizzaSize.equals(PizzaSize.ŚREDNIA)) {
            setPrice(15 * howMany);
        } else {
            setPrice(20 * howMany);
        }
        return getPrice();
    }

    @Override
    public String toString() {
        return "Zamówienie: " +
                "Pizza " + pizzaType +
                ", rozmiar=" + pizzaSize +
                ", ilość=" + getHowMany() +
                ", cena(pizza)=" + getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return pizzaType == pizza.pizzaType && pizzaSize == pizza.pizzaSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pizzaType, pizzaSize);
    }
}
