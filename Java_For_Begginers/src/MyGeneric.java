public class MyGeneric<T> {
    T item;

    public MyGeneric(T item) {
        this.item = item;
    }
    public void printItem(){
        System.out.println(item);
        System.out.println("Klasa generyczna: " + item.getClass().getSimpleName());
    }
}
