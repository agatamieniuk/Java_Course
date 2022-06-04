package calculation;

import java.util.Objects;

public class ValuesHolder {
    private final int a;
    private final int b;

    public ValuesHolder(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int getResult(Calculation calculation){
        return calculation.calculate(a,b);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValuesHolder that = (ValuesHolder) o;
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

    @Override
    public String toString() {
        return "calculation.operation.ValuesHolder{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
