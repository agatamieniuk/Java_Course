public class App {
    private static final Task task = new Task();

    public static void main(String[] args) {

        System.out.println(App.sumOfDigits(123));

   }

    public static Integer sumOfDigits(Integer x) {
        Integer sum = 0;
        String number = x.toString();
        String[] split = number.split("");
        for (String splitStringNumber : split) {
            Integer newX = sum.parseInt(splitStringNumber);
            sum = sum + newX;
        }return sum;
    }
}







