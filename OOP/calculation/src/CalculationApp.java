public class CalculationApp {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        ValuesHolder holder1 = new ValuesHolder(a, b);
        ValuesHolder holder2 = new ValuesHolder(a, b);
        /*bez ustawienia equals() - hash code() metoda domyslna z klasy Object porownuje w equals referencje (==),
        dopiero po nadpisaniu ww. metod porównywane są wartości*/
        System.out.println(holder1.equals(holder2));
    }
}