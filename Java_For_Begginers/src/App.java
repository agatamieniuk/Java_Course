public class App {
    public static void main(String[] args) {

        Engine engine = new Engine();
        engine.power = 100;
        engine.capacity = 1000;

        Car car = new Car();
        car.engine = engine;
        car.name = "Joe's Car";

        car.printName();
        car.engine.printPower();
        car.engine.printCapacity();
    }
}