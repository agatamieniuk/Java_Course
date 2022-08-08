package calculation.operation;

import calculation.Calculation;

public class Add implements Calculation {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }

    @Override
    public String toString() {
        return "+";
    }
}
