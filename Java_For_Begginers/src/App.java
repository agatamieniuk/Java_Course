import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final Task task = new Task();
    public static void main(String[] args) throws IOException, InterruptedException {

        ObjectMapper objectMapper = new ObjectMapper();
        ObjectWriter objectWriter = objectMapper.writerWithDefaultPrettyPrinter();

        Car obj = CarFactory.createRandomCar();

        List<Car> cars = new ArrayList<>();
        cars.add(obj);
        cars.add(obj);

        String json = objectWriter.writeValueAsString(cars);
        for(Car car: cars){
            System.out.println(car);
        }
        System.out.println(json);

        TypeReference<List<Car>> typeReference = new TypeReference<>() {};
        List<Car> fromJson = objectMapper.readValue(json, typeReference);

        System.out.println(fromJson);
        System.out.println(cars.equals(fromJson));



    }
}






