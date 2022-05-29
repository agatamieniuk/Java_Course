import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws IOException {
        Path path1 = Path.of("file.txt");
        Scanner scanner = new Scanner(System.in);
        String line = "";
        do {
            line = line.concat(scanner.nextLine() + "\n");
//            System.out.println(line);
            Files.writeString(path1, line);

        }
        while (!line.contains("#"));

        List<String> strings = Files.readAllLines(path1);
        for(String string: strings){
            System.out.println(string);
        }



    }
}






