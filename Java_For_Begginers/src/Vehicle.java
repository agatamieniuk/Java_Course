public interface Vehicle {
    public default void printType(){
        System.out.println(getClass().getSimpleName());
    }
}
