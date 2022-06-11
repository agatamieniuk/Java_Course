public class Ex {
    public static void ex1a() {
        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i;
            System.out.println(tab[i]);
        }
    }

    public static void ex1b(int b) {

        try {
            int[] tab = new int[10];
            for (int i = 0; i < tab.length; i++) {
                tab[i] = i;
            }
            tab[b] = -1;
            for (int i : tab) {
                System.out.println(i);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Number out of range");
        }
    }

    public static int ex1c(int b) {
        int[] tab = new int[b];
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i;
        }
        for (int i : tab) {
//          sum = i + sum;
            sum += i;
        }
//        System.out.println("Sum: " + sum);
        return sum;
    }

    public static void ex2a() {
        Double a = 1.0;
        Double b = 1.0;
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }

    public static void ex2b() {
        String a = "ala";
        String b = "ala";
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }

    public static void ex2c() {
        String a = new String("ala");
        String b = new String("ala");
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }

    public static void ex() {

    }
}
