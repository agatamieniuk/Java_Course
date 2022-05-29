import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(scanner.nextLine()).reverse();
        String s = stringBuilder.toString();
        System.out.println(s);

    }
}






