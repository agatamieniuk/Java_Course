package com.infoshareacademy;

import com.infoshareacademy.model.vehicle.Car;
import com.infoshareacademy.model.vehicle.Engine;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Engine engine1 = new Engine();
        Engine engine2 = new Engine();
        Engine engine3 = new Engine();
        Engine engine4 = new Engine();

        engine1.setCapacity(1000);
        engine2.setCapacity(2000);
        engine3.setCapacity(3000);
        engine4.setCapacity(1000);

        engine1.setPower(100);
        engine2.setPower(200);
        engine3.setPower(300);
        engine4.setPower(100);

        Set<Engine> engines = ex3(engine1, engine2, engine3, engine4);

        System.out.println(engines.size());
        for (Engine car : engines) {
            System.out.println(car);
        }


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

    public static Set<Engine> ex3(Engine... engines) {
//        Set<Engine> setEngine = new HashSet<>();
//
//        for(Engine eng: engines){
//            setEngine.add(eng);
//        }
        return new HashSet<>(Arrays.asList(engines)); //zapis jednolinijkowy
    }

    public static void ex() {
    }

}
