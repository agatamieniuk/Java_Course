import java.util.*;

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

    public static void ex3a() {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(1);
        lista.add(2);
        System.out.println("list: " + lista);
        System.out.println("size: " + lista.size());
    }

    public static void ex3b() {
        List<Integer> list = new ArrayList<>();
        for (int i = 10; i > 0; i--) {
            list.add(i);
        }
        System.out.println(list);
        int value[] = {3, 5, 8};
        for (int i : value) {
//            System.out.println(i);
            System.out.println("[" + list.indexOf(i) + "] " + i);
        }
    }

    public static void ex4a() {
        Set<Integer> mySet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                mySet.add(i);
            }
        }
        System.out.println(mySet);
        System.out.println(mySet.size());

        for (int i = 0; i < 10; i++) {
            mySet.add(i);
        }
        System.out.println(mySet);
        System.out.println(mySet.size());
    }

    public static void ex4b() {
        Set<Integer> mySet = new TreeSet<>();
        for (int i = 15; i > 0; i--) {
            mySet.add(i);
        }
//        System.out.println(mySet);
        for (int i : mySet) {
            System.out.println(i);
        }
    }

    public static void ex5(String name) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("agata", 34);
        myMap.put("joanna", 34);
        myMap.put("piotr", 35);
        myMap.put("piotr", 1);

        if (name.equals("keys")) {
            System.out.println(myMap.keySet());
        } else if (name.equals("values")) {
            System.out.println(myMap.values());
        } else if (name.equals("all")) {
            System.out.println(myMap);
        }
    }
}

