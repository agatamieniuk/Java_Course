import java.util.Objects;

public class ValuesHolder {
    private final int a;
    private final int b;

    public ValuesHolder(int a, int b) {
        this.a = a;
        this.b = b;
    }

    //nadpisanie equals-hashCode sprawia, ze nie wywola sie metoda z klasy Object ktora porownuje referencje (==)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //referuje do tego samego miejsca w pamieci
        if (o == null || getClass() != o.getClass()) return false; //czy sa tej samej klasy (jesli nie sa to na pewno nie bedzie to ten sam obiekt)
        ValuesHolder that = (ValuesHolder) o; //jesli nie sa tego samego miejsca w pamieci i tej samej klasy to wtedy dopiero program porownuje pola obiektow
        return a == that.a && b == that.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

}
