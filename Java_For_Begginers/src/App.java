public class App {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.capacity = 100;
        engine.power = 1000;
        System.out.println(engine.capacity + " " + engine.power);

        Engine engine2 = new Engine();
        engine2.capacity = 200;
        engine2.power = 2000;
        System.out.println(engine2.capacity + " " + engine2.power);
    }
}