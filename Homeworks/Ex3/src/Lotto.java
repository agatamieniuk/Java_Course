import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Lotto {
    private Scanner scanner = new Scanner(System.in);
    private int range;
    private int number;
    private boolean run = false;

    public static void runLotto(){
        Lotto lotto = new Lotto();
        lotto.setRange();
        lotto.setNumber();
        lotto.drawNumbers();
    }

    private void setRange() {
        do {
            try {
                System.out.println("Podaj zakres losowania (od 1 do ...):");
                range = scanner.nextInt();
                if (range <= 0) {
                    System.out.println("Niepoprawny znak, spróbuj ponownie:");
                } else {
                    run = true;
                }
            } catch (InputMismatchException exception) {
                System.out.println("Niepoprawny znak, spróbuj ponownie:");
                scanner.nextLine();
            } catch (NegativeArraySizeException e) {
                System.out.println("Niepoprawny znak, spróbuj ponownie:");
                scanner.nextLine();
            }
        } while (!run);
    }

    private void setNumber() {
        run = false;
        do {
            try {
                System.out.println("Podaj ilość liczb do wylosowania:");
                number = scanner.nextInt();
                if (number <= 0) {
                    System.out.println("Niepoprawny znak, spróbuj ponownie:");
                } else {
                    run = true;
                }
            } catch (InputMismatchException exception) {
                System.out.println("Niepoprawny znak, spróbuj ponownie:");
                scanner.nextLine();
            } catch (NegativeArraySizeException e) {
                System.out.println("Niepoprawny znak, spróbuj ponownie:");
                scanner.nextLine();
            }
        } while (!run);
    }

    private void drawNumbers() {
        System.out.println("------------------------------------");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.printf("Rozpoczynam losowanie %d liczb z zakresu od 1 do %d.%nWylosowane liczby, to: %n", number, range);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        Integer[] numbersFromRange = new Integer[range];
        for (int i = 0; i < numbersFromRange.length; i++) {
            numbersFromRange[i] = i + 1;
        }
        Collections.shuffle(Arrays.asList(numbersFromRange));

        Integer[] lottoNumbers = new Integer[number];
        for (int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = numbersFromRange[i];
            System.out.println(lottoNumbers[i]);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
//        System.out.println(Arrays.toString(lottoNumbers));
        Path pathToLotto = Path.of("src", "LottoFile.txt");
        try {
            Files.write(pathToLotto, Arrays.toString(lottoNumbers).getBytes());
        } catch (IOException e) {  }
    }


}
