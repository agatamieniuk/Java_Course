public class Calculator {
    void calculate(int a, int b, String sign) {
        int sum = 0;
        try {
            if (sign.equals("*")) {
                sum = a * b;
                System.out.println(sum);
            } else if (sign.equals("/")) {
                sum = a / b;
                System.out.println(sum);
            } else if (sign.equals("+")) {
                sum = a + b;
                System.out.println(sum);
            } else if (sign.equals("-")) {
                sum = a - b;
                System.out.println(sum);
            }
        } catch (ArithmeticException e) {
            System.out.println("Błąd operacji.");
        }
    }
}