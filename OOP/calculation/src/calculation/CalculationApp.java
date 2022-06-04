package calculation;

import calculation.operation.Add;
import calculation.operation.Sub;

public class CalculationApp {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        ValuesHolder holder = new ValuesHolder(a, b);
        Calculation[] calculationStrategy = {new Sub(), new Add()};
        for (Calculation calculation : calculationStrategy) {
            performCalculation(holder, calculation);
        }

    }

    private static void performCalculation(ValuesHolder holder, Calculation calculationStrategy) {
        int result = holder.getResult(calculationStrategy);
        System.out.printf("%d %s %d = %d%n", holder.getA(),calculationStrategy, holder.getB(), result);
    }
}