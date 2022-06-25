package com.infoshareacademy;

import com.infoshareacademy.exercises.Ex;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Integer[] table = ex1a(1, 2, 3, 4);

        for(Integer tables: table){
            System.out.println(tables);
        }
    }

    public static Integer[] ex1a(Integer...params) {
        Integer[] tab = new Integer[params.length];

         for(int i = 0; i < params.length; i++){
            tab[i] = params[i]*2;
        }return tab;
    }

}
