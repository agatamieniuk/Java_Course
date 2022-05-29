import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = 1;
        while(num % 3 != 0) {
            num = scanner.nextDouble();
            System.out.println("Podano liczbe: " + num);
            if(num % 3 == 0){
                System.out.println(num + " jest podzielna przez 3");
            } else {
                System.out.println(num + " NIE jest podzielna przez 3");
            }
            System.out.println("Wynik: " + num / 3);
        }



    }
}


