public class EngineFactory extends VehicleFactory {

    public static Engine generateEngine() {
        Engine engine = new Engine();
        engine.setPower(generateNumber(50, 200, 10));
        engine.setCapacity(generateNumber(1000, 5000, 1000));
        return engine;
    }

    public static Engine[] generateEngines(int amount) {
        Engine[] result = new Engine[amount];
        for (int i = 0; i < amount; i++) {
            result[i] = generateEngine();
        }

        return result;
    }
}