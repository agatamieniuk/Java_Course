
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {

        ObjectMapper objectMapper = new ObjectMapper();
        ObjectWriter objectWriter = objectMapper.writerWithDefaultPrettyPrinter();

        Car obj = CarFactory.createRandomCar();
        String json = objectWriter.writeValueAsString(obj);

        System.out.println(obj);
        System.out.println(json);

        Car fromJson = objectMapper.readValue(json, Car.class);
        System.out.println(fromJson);
        System.out.println(obj.equals(fromJson));

    }
}






