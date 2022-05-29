import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int intParam = 0;
        boolean flag = true;

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                intParam = scanner.nextInt();
                System.out.println(intParam);
                flag = false;
            } catch (Exception e) {
                System.out.println("Podaj liczbę!");
            }
        }while(flag);


    }
}






