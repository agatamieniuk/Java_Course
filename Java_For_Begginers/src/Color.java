public enum Color {
    RED("czerwony"),
    GREEN("zielony"),
    BLUE("niebieski");

    private final String colorTranslation;

    public String getColorTranslation() {
        return colorTranslation;
    }

    Color(String colorTranslation) {
        this.colorTranslation = colorTranslation;
    }

}

