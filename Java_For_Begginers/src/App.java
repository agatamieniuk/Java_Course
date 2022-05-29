import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App {
    private static final Task task = new Task();
    public static void main(String[] args) {

        Car obj = CarFactory.createRandomCar();

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();

        String json = gson.toJson(obj);
        System.out.println(json);

        Car fromJson = gson.fromJson(json, Car.class);
        System.out.println(fromJson);
        System.out.println(fromJson.equals(obj));


    }
}






