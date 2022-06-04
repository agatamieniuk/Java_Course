public class CalculationApp {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        ValuesHolder holder1 = new ValuesHolder(a, b);
        Object holder2 = new ValuesHolder(a, b);
        System.out.println(holder1.equals(holder2));

        System.out.println(holder1);
    }
}