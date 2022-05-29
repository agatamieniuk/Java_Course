import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            double doubleParam = scanner.nextDouble();
            System.out.println(doubleParam);
        } catch (Exception e) {
            System.out.println("Podaj liczbę!");
        }


    }
}






