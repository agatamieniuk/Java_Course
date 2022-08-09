package com.example.web.enums;

public enum Color {
    BLACK("Black"),
    WHITE("White");

    private final String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}