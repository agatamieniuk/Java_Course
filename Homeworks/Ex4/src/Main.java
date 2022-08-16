import menu.BurgerMenu;
import menu.DrinkMenu;
import menu.PizzaMenu;
import menu.PizzaSize;
import model.Burger;
import model.Drink;
import model.Pizza;
import service.Client;
import service.Order;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Order order = new Order();

//      Dzwoni klient: Zenek z ulicy Łąkowej 11E i zamawia dużą pizzę Pepperoni oraz 2 szt. soku.
        Client client1 = new Client("Zenek", 664716444, "ul. Łąkowa 11E");
        Pizza pizza1 = new Pizza(PizzaMenu.PEPPERONI, PizzaSize.DUŻA, 1);
        Drink drink1 = new Drink(DrinkMenu.SOK, 2);
//        Z listą:
        List<Order> order1 = new ArrayList<>();
        order1.add(client1);
        order1.add(pizza1);
        order1.add(drink1);
        for (Order ord1 : order1) {
            System.out.println(ord1);
        }
        System.out.println("ŁĄCZNIE: " + order.totalPrice(pizza1, drink1) + "\n");
//        Bez listy:
//        System.out.println(client1 + "\n " + pizza1 + "\n " + drink1);
//        System.out.println("ŁĄCZNIE: " + order.totalPrice(pizza1, drink1));
//        System.out.println("---------------------------------------------------------------");

//      Dzwoni kolejny klient: Krysia z ulicy Nadrzecznej 6/3 i zamawia małą pizzę Diavola, średnią Capriciosę oraz colę.
        Client client2 = new Client("Krysia", 609397291, "Nadrzeczna 6/3");
        Pizza pizza2a = new Pizza(PizzaMenu.DIAVOLA, PizzaSize.MAŁA, 1);
        Pizza pizza2b = new Pizza(PizzaMenu.CAPPRICIOSA, PizzaSize.ŚREDNIA, 1);
        Drink drink2 = new Drink(DrinkMenu.COLA, 1);
//        Z listą:
        List<Order> order2 = new ArrayList<>();
        order2.add(client2);
        order2.add(pizza2a);
        order2.add(pizza2b);
        order2.add(drink2);
        for (Order ord2 : order2) {
            System.out.println(ord2);
        }
        System.out.println("ŁĄCZNIE: " + (order.totalPrice(pizza2a, drink2) + pizza2b.getPrice()) + "\n");
//        Bez listy:
//        System.out.println(client2 + "\n " + pizza2a + "\n" + pizza2b + "\n " + drink2);
//        System.out.println("ŁĄCZNIE: " + (order.totalPrice(pizza2a, drink2) + pizza2b.getPrice()));
//        System.out.println("---------------------------------------------------------------");
//
////      Dzwoni kolejny klient: Antoni z ulicy Polnej 13 i zamawia hamburgera oraz piwo.
        Client client3 = new Client("Antoni", 677322291, "Polna 13");
        Burger burger3 = new Burger(BurgerMenu.HAMBURGER, 1);
        Drink drink3 = new Drink(DrinkMenu.PIWO, 1);
//        Z listą:
        List<Order> order3 = new ArrayList<>();
        order3.add(client3);
        order3.add(burger3);
        order3.add(drink3);
        for (Order ord3 : order3) {
            System.out.println(ord3);
        }
        System.out.println("ŁĄCZNIE: " + order.totalPrice(burger3, drink3) + "\n");
//        Bez listy:
//        System.out.println(client3 + "\n " + burger3 + "\n " + drink3);
//        System.out.println("ŁĄCZNIE: " + order.totalPrice(burger3, drink3));
//        System.out.println("---------------------------------------------------------------");
    }
}