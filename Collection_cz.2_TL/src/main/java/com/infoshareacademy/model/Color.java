package com.infoshareacademy.model;

public enum Color {
    RED("czerwony", 1),
    GREEN("zielony", 2),
    BLUE("niebieski", 3);

    private final int colorCode;
    private final String colorName;

    Color(String colorName, int colorCode) {
        this.colorName = colorName;
        this.colorCode = colorCode;
    }

    public String getColorName() {
        return colorName;
    }

    public int getColorCode() {
        return colorCode;
    }

}
