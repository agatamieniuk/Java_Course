public class CarFactory extends VehicleFactory {

    public static Car createRandomCar() {
        Car car = new Car();
        car.setName(generateName());
        car.setMaxSpeed(generateNumber(100, 250, 10));
        car.setEngine(EngineFactory.generateEngine());
        car.setColor(generateColor());

        return car;
    }

    public static Car[] createRandomCars(int amount) {
        Car[] result = new Car[amount];
        for (int i = 0; i < amount; i++) {
            result[i] = createRandomCar();
        }
        return result;
    }

    private static String generateName() {
        String[] names = {"Audi", "Opel", "Mercedes", "Fiat", "Ford", "BMW"};
        return names[random.nextInt(names.length)];
    }

    private static Color generateColor() {
        Integer index = generateNumber(0, Color.values().length, 1);
        return Color.values()[index];
    }
}