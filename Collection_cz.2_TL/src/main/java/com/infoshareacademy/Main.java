package com.infoshareacademy;

import com.infoshareacademy.exercises.Ex;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,11);
        map.put(2,23);
        map.putIfAbsent(3,12);
        map.putIfAbsent(3,13);

        Set<Integer> keys = map.keySet();
        Collection<Integer> values = map.values();

        System.out.println(keys);
        System.out.println(values);

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for(Map.Entry entry: entries){ //wyswietlenie par klucz=wartosc dzieki entrySet();
            System.out.println(entry);
        }


    }
}
