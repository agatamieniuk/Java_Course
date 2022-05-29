import java.time.LocalDate;
import java.util.Random;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println(name);
    }

    public LocalDate getExamDate(){
        Random random = new Random();
        int month = random.nextInt(1,13); //origin: inclusive, bound: exclusive
        int day = random.nextInt(1, 32);

        LocalDate localDate = LocalDate.of(2022, month, day);
        return localDate;
    }
}
