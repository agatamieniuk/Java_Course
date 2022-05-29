public class App {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setName("car1");
        car1.setMaxSpeed(200);
        Car car2 = new Car();
        car2.setName("car2");
        car2.setMaxSpeed(200);

        if (car1.getMaxSpeed() > car2.getMaxSpeed()) {
            System.out.println(car1.getName());
        } else if (car2.getMaxSpeed() > car1.getMaxSpeed()) {
            System.out.println(car2.getName());
        } else {
            System.out.println("Rowne");
        }
    }
}