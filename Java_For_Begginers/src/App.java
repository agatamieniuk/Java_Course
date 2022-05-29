public class App {
    public static void main(String[] args) {

        Engine engine = new Engine();
        engine.power = 100;
        engine.capacity = 1000;

        Car car = new Car();
        car.engine = engine;
        System.out.println(car.engine.capacity + " " + car.engine.power);


        Car car2 = new Car();
        engine.power = 200;
        engine.capacity = 2000;
        car2.engine = engine;
        System.out.println(car2.engine.capacity + " " + car2.engine.power);
    }
}