public class App {
    private static final Task task = new Task();

    public static void main(String[] args) {


        Vehicle car = new Car();
        Vehicle boat = new Boat();

        car.isDamaged = true;
        boat.isDamaged = false;

        car.repair();
        System.out.println(car.isDamaged());
    }
}






