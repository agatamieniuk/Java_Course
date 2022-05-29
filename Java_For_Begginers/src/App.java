public class App {
    public static void main(String[] args) {
        //tworzenie obiektów
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();

        //ustawienie wartości dla obiektu myClass1
        myClass1.number = 12;
        myClass1.text = "obiekt 1";

        //ustawienie wartości dla obiektu myClass2
        myClass2.number = 13;
        myClass2.text = "obiekt 2";

        //wypisanie wartości obiektu myClass1
        System.out.println(myClass2.number);
        System.out.println(myClass2.text);

        //wypisanie wartości obiektu myClass2
        System.out.println(myClass1.number);
        System.out.println(myClass1.text);
    }
}