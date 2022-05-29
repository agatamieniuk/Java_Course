import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int withDot = line.length();
        System.out.println("With dot: " + withDot);
        line = line.replace(".","");
        int withoutDot = line.length();
        System.out.println("Without dot: " + withoutDot);
        System.out.println("Sum of the dots " + (withDot - withoutDot));

    }
}






