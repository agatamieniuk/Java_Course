public class App {
    private static final Task task = new Task();

    public static void main(String[] args) {
        System.out.println(App.concatenate("info", "Share"));


    }

    public static String concatenate(String firstWord, String secondWord) {
        String concat = firstWord.concat(secondWord);
        return concat;
    }
}






