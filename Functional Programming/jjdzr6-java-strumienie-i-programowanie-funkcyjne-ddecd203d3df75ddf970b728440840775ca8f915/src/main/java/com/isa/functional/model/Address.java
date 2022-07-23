package com.isa.functional.model;

public class Address {

    private final String state;
    private final String city;
    private final String stret;
    private final Integer population;

    public Address(String state, String city, String stret, Integer population) {
        this.state = state;
        this.city = city;
        this.stret = stret;
        this.population = population;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getStret() {
        return stret;
    }

    public Integer getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", stret='" + stret + '\'' +
                ", population=" + population +
                '}';
    }
}
