public class App {
    public static void main(String[] args) {

        Student student1 = new Student("Kasia");
        Student student2 = new Student("Zosia");
        Student student3 = new Student("Ola");

        student1.printName(); System.out.println(student1.getExamDate());
        student2.printName(); System.out.println(student2.getExamDate());
        student3.printName(); System.out.println(student3.getExamDate());

    }
}