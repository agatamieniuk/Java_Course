public class App {
    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        myClass.setNumber(1);
        myClass.setText("Jeden");
        System.out.println(myClass.getNumber() + " " + myClass.getText());
    }
}