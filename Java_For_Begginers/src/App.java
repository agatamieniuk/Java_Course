import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class App {
    private static final Task task = new Task();
    public static void main(String[] args) {

        List<Car> objList = new ArrayList<>();
        objList.add(CarFactory.createRandomCar());
        objList.add(CarFactory.createRandomCar());

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();

        String json = gson.toJson(objList);
        System.out.println(json);

        TypeToken typeToken = new TypeToken<List<Car>>(){};
        List<Car> fromJson = gson.fromJson(json, typeToken.getType());

        System.out.println(fromJson);
        System.out.println(fromJson.equals(objList));
    }
}






