public class App {
    private static final Task task = new Task();

    public static void main(String[] args) {
        Car car = new Car();
        car.isDamaged = true;
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, boat};

        Workshop workshop = new Workshop();
        workshop.vehicles(vehicles);

        System.out.println(workshop.getVehiclesAmount());

        System.out.println(car.isDamaged);
        System.out.println(boat.isDamaged);
        workshop.repairAll();
        System.out.println(car.isDamaged);
        System.out.println(boat.isDamaged);
    }
}






