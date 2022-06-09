import java.util.Scanner;

public class Menu {
    String[] menuTab = new String[]{"1.START", "2.OPCJE", "3.AUTORZY", "4.ZAKOŃCZ", "START GRY ZA 5 SEKUND", "1.Dźwięk", "2.Grafika", "3.Sterowanie", "4.Powrót", "Pozdrawiamy."};
    boolean flag = true;

    public void printMenu() {
        System.out.println(menuTab[0]);
        System.out.println(menuTab[1]);
        System.out.println(menuTab[2]);
        System.out.println(menuTab[3]);
    }

    public Menu() {
        while (flag) {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            int option = 0;
            try {
                option = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Błąd");
            }
            switch (option) {
                case 1:
                    System.out.println("[1]");
                    System.out.println(menuTab[4]);
                    break;
                case 2:
                    System.out.println("[2]");
                    System.out.println(menuTab[5]);
                    System.out.println(menuTab[6]);
                    System.out.println(menuTab[7]);
                    System.out.println(menuTab[8]);
                    try {
                        option = scanner.nextInt();
                    } catch (Exception e) {
                        System.out.println("Błąd");
                    }
                    if (option == 1 || option == 2 || option == 3) {
                        System.out.println("/////");
                        flag = false;
                    }
                    break;
                case 3:
                    System.out.println("[3]");
                    System.out.println(menuTab[9]);
                    break;
                case 4:
                    break;
            }
        }
    }
}
