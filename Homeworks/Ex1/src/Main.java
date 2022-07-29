import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Task1("jasio"));
        Task2();
    }

    public static char Task1(String word) {
        System.out.print(word + " - ");
        return word.charAt(0);
    }

    public static void Task2() {
        System.out.println("Wybierz pozadane dzialanie:");
        System.out.println("+ -> dodawanie");
        System.out.println("- -> odejmowanie");
        System.out.println("* -> mnozenie");
        System.out.println("/ -> dzielenie");
        Scanner scanner = new Scanner(System.in);
        String znak = scanner.nextLine();
        System.out.println("Zdefiniuj pierwsza liczbe:");
        Double a = scanner.nextDouble();
        System.out.println("Zdefiniuj druga liczbe:");
        Double b = scanner.nextDouble();

        if (znak.contains("+")) {
            System.out.println(a + " + " + b + " = " + Calculator.add(a, b));
        } else if (znak.contains("-")) {
            System.out.println(a + " - " + b + " = " + Calculator.sub(a, b));
        } else if (znak.contains("*")) {
            System.out.println(a + " * " + b + " = " + Calculator.mul(a, b));
        } else if (Calculator.div(a, b).isInfinite()) {
            System.out.println("Nie dziel przez zero!");
        } else if (znak.contains("/")) {
            System.out.println(a + " / " + b + " = " + Calculator.div(a, b));
        } else {
            System.out.println("Niepoprawne znaki w dzialaniu.");
        }
    }
}

