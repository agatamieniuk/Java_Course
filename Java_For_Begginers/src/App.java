public class App {
    public static void main(String[] args) {

        Engine engine = new Engine();
        engine.setPower(1001);
        engine.setCapacity(10001);

        //Car objects
        Car car = new Car();
        car.setName("Autko");
        car.setMaxSpeed(100);
        car.setEngine(engine);

        System.out.println(car.getEngine().getCapacity());
        System.out.println(car.getEngine().getPower());
        System.out.println(car.getName());
        System.out.println(car.getMaxSpeed());


    }
}