
public class App {
    public static void main(String[] args) {
        getNotEvenSum(5);
        getNotEvenSum(7);

    }

    public static int getNotEvenSum(int a) {
        int sum = 0;
        if (a < 20) {
            for (int i = 0; i < a; i++) {
                if (i % 2 == 1) {
                    continue;
                }
                sum = sum + i;
            }
            System.out.println(sum);
        } else if (a > 20) {
            System.out.println("Za duza liczba");
        } else {
            System.out.println("Liczba równa 20.");
        } return a;
    }
}


