package com.infoshareacademy.comparators;

import com.infoshareacademy.model.vehicle.Car;
import java.util.Comparator;

public class CapacityComparator implements Comparator<Car> {
    @Override
    public int compare(Car car, Car t1) {
        return car.getEngine().getCapacity().compareTo(t1.getEngine().getCapacity());
    }
}
