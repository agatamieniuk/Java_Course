package com.infoshareacademy;

import com.infoshareacademy.exercises.Ex;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,null);
        map.put(2,null);
        map.putIfAbsent(3,12);
        map.putIfAbsent(3,13);

        Set<Integer> keys = map.keySet();
        Collection<Integer> values = map.values();

        System.out.println(keys);
        System.out.println(values);
        System.out.println("-----------");

        for(Integer key: map.keySet()){ //wyciagamy za pomoca petli wartosci z mapy
            Integer value = map.get(key);
            System.out.println(value);
         }

        System.out.println("-----------");
        Map<Integer, List<Integer>> map2 = new HashMap<>();
        map2.put(1,Arrays.asList(1,2,3));
        map2.put(2,null);

        for(Integer key: map2.keySet()){
            map2.putIfAbsent(key, new ArrayList<>());//<= zabezpieczenie zeby jesli bedzie null to w to miejsce wrzucic pusta liste,
                                                     //obiekt value nigdy nie bedzie nullem
                        
            List<Integer> valueList = map2.get(key);
            int valueSize = valueList.size();

            System.out.println("wartosci: " + valueList);
            System.out.println("rozmiar: " + valueSize);
        }

    }
}
