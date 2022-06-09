public abstract class Vehicle {
    public boolean isDamaged;

    public boolean isDamaged() {
        return isDamaged;
    }

    public void repair() {
        isDamaged = false;
    }
}
