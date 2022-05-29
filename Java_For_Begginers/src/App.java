import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car();
        System.out.println("Set car name:");
        car.setName(scanner.nextLine());
        System.out.println("Now car name is: " + car.getName());

        Engine engine = new Engine();
        System.out.println("Set engine power: ");
        engine.setPower(scanner.nextInt());
        car.setEngine(engine);
        System.out.println("Now engine power is: " + car.getEngine().getPower());




    }
}


