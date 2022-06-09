import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Task {

    public void run() {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        Path path = Path.of("src", "main", "resources", "file.txt");

        try {
            Files.writeString(path, line);
            String s = Files.readString(path);
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
