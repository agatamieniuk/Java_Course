public class Boat implements Vehicle {
    public int lenght;

    @Override
    public void printType() {
        System.out.println(getClass().getSimpleName());
    }
}
