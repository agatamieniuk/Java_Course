package calculation;

import calculation.operation.Add;
import calculation.operation.Sub;

public class CalculationApp {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        ValuesHolder holder = new ValuesHolder(a, b);
        /*Implememtuje obiekt typu calculation. Obiekt typu calculation ma implementację add/sub (tabela, dwie wartosci)
        Obiekt calculationStrategy, tego samego typu - Calculation - jest wielopostaciowy, moze byc Add, moze byc Sub - przykład POLIMORFIZMU*/
        Calculation[] calculationStrategy = {new Sub(), new Add()};
        for (Calculation calculation : calculationStrategy) {
            //przekazanie obiektów do metody
            performCalculation(holder, calculation);
        }

    }

    private static void performCalculation(ValuesHolder holder, Calculation calculationStrategy) {
        //informuję, jak ma zostać wywolana operacja
        int result = holder.getResult(calculationStrategy);
        System.out.printf("%d %s %d = %d%n", holder.getA(),calculationStrategy, holder.getB(), result);
    }
}