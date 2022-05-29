import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String fromFile = "";
        Path path = Path.of("src", "Color.java");
        try {
            fromFile = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(fromFile);

        Path path1 = Path.of("file.txt");
//        try {
//            Files.write(path1, fromFile.getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            Files.writeString(path1, fromFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}






