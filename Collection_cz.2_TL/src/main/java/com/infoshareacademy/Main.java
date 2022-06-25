package com.infoshareacademy;

import com.infoshareacademy.exercises.Ex;
import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.model.vehicle.Car;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        CarFactory car = new CarFactory();
        Car randomCar = car.createRandomCar();
        Car randomCar2 = car.createRandomCar();
        Car randomCar3 = car.createRandomCar();

        System.out.println(randomCar);
        System.out.println(randomCar2);
        System.out.println(randomCar3);
        System.out.println("-------------");

        List<Car> carList = ex2(randomCar, randomCar2, randomCar2);
        for(Car cars: carList){
            System.out.println(cars);
        }
//        System.out.println(carList); <=alternatywne wyswietlenie listy


    }

    public static Integer[] ex1a(Integer... params) {
        Integer[] tab = new Integer[params.length];

        for (int i = 0; i < params.length; i++) {
            tab[i] = params[i] * 2;
        }
        return tab;
    }

    public static Car[] ex1b(Car... cars) {
        Car[] carTab = new Car[cars.length];

        for (int i = 0; i < cars.length; i++) {
            carTab[i] = cars[i];
        }
        return carTab;
    }

    public static List<Car> ex2(Car... cars) {
//        List<Car> carList = new ArrayList<>();

//        za pomocą petli forEach:
//        for(Car car: cars){
//            carList.add(car);
//        }

//        to samo za pomocą pętli for:
//        for (int i = 0; i < cars.length; i++) {
//            carList.add(cars[i]);
//        }
        return new ArrayList<>(Arrays.asList(cars)); //zapis jako jednolinijkowiec
    }

    public static void ex() {
    }

}
