public class App {
    public static void main(String[] args) {

        getEven(19);


    }

    public static void getEven(int num) {
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i % 11 == 0) {
                break;
            }
            System.out.println(i);
        }
    }
}


