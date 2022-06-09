import java.util.Random;

public abstract class VehicleFactory {
    static final Random random = new Random();

    protected static Integer generateNumber(int min, int max, int step) {
        return random.ints(min/step, max/step)
                .findFirst()
                .getAsInt() * step;
    }
}