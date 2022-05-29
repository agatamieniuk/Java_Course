import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class App {
    private static final Task task = new Task();

    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal.introduce();
        animal1.introduce();
        animal2.introduce();
    }
}






