package com.example.web.enums;

public enum Client {
    ABC("Abc"),
    BCD("Bcd"),
    CDE("Cde");

    private final String value;

    Client(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}