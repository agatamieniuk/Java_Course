package model;

import menu.BurgerMenu;
import service.Order;

import java.util.Objects;

public class Burger extends Order {
    private BurgerMenu burger;

    public Burger() {
    }

    public Burger(BurgerMenu burger, int howMany) {
        this.burger = burger;
        this.setHowMany(howMany);
        setPrice(burgerPrice(burger, howMany));
    }

    private double burgerPrice(BurgerMenu burger, int howMany) {
        if (burger.equals(BurgerMenu.HAMBURGER)) {
            setPrice(10 * howMany);
        } else {
            setPrice(15 * howMany);
        }
        return getPrice();
    }

    @Override
    public String toString() {
        return "Zamówienie:" +
                " Burger " + burger +
                ", ilość=" + getHowMany() +
                ", cena(burgery)=" + getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Burger burger1 = (Burger) o;
        return burger == burger1.burger;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), burger);
    }
}