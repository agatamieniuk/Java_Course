
public class App {
    public static void main(String[] args) {
    getArray(4);
    getArray(1);
    }
    public static int[] getArray(int a){
        int[] newTab = new int[10];
        for (int i = 0; i < newTab.length; i++) {
            newTab[i] = a + i;
            System.out.println(newTab[i]);
        } return newTab;
    }
}






