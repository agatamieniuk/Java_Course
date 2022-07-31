package calculation.operation;

import calculation.Calculation;

public class Sub implements Calculation {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }

    @Override
    public String toString() {
        return "-";
    }
}
