public abstract class AbstractCar {
    public abstract void printNameAbstract();
    public void printNameNonAbstract(){
        System.out.println(getClass().getSimpleName());
    }
}
