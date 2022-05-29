import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class App {
    private static final Task task = new Task();

    public static void main(String[] args) {

    Vehicle car = new Car();
    car.printType();
    Vehicle boat = new Boat();
    boat.printType();
    }
}






