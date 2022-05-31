public class App {
    private static final Task task = new Task();

    public static void main(String[] args) {
        System.out.println(App.addMultiply(2,7));
    }

    public static Integer addMultiply(Integer firstNum, Integer secondNum) {
        Integer sum = 0;
        for (int i = 1; i <= secondNum; i++){
            sum = firstNum + sum;
        }
        return sum;
    }
}






