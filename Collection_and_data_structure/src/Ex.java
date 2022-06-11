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

    public static void ex() {

    }
}