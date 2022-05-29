public class App {
    public static void main(String[] args) {
    isNumberEven(3);
    isNumberEven(2);
    }
    public static int isNumberEven(int i){
        switch (i % 2) {
            case 0:
                System.out.println("Parzysta");
                break;
            case 1:
                System.out.println("Nieparzysta");
        }return i;
    }
}