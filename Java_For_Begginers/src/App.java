public class App {
    private static final Task task = new Task();

    public static void main(String[] args) {

    MyGeneric<String> myGeneric = new MyGeneric<>("Liść");
    myGeneric.printItem();

    MyGeneric<Integer> myGeneric1 = new MyGeneric<Integer>(2);
    myGeneric1.printItem();
    }
}






