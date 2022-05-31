import model.Grade;
import model.Student;
import model.Task;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task(1, "Write calculator program.", 5);
        Task task2 = new Task();
        task2.setTaskNumber(2);
        task2.setMaxPoints(10);
        task2.setShortDescription("Write three different Strings.");

        Student student1 = new Student("Kasia", "Stolec", "kstolec");
        Student student2 = new Student();
        student2.setName("Julian");
        student2.setSurname("Marchewka");
        student2.setGitLogin("marchewJJ");

        Grade grade1 = new Grade(task1, student1, 3, "Good");
        Grade grade2 = new Grade(task1, student2, 5, "Excellent");
        Grade grade3 = new Grade();
        Grade grade4 = new Grade();

        grade3.setTaskNum(task2);
        grade3.setStudent(student2);
        grade3.setPointsScored(10);
        grade3.setFeedback("Great!");
        grade4.setTaskNum(task2);
        grade4.setStudent(student1);
        grade4.setPointsScored(2);
        grade4.setFeedback("You can do better.");

        Grade grade[] = new Grade[]{grade1, grade2, grade3, grade4};
        for (int i = 0; i < grade.length; i++) {
            grade[i].getTask().getTaskDescription();
            System.out.print(" => ");
            grade[i].getStudent().getStudentFullName();
            System.out.print("gets " + grade[i].getPointsScored() + " points (Feedback: " + grade[i].getFeedback() + ").");
            System.out.println("\n");
        }
    }
}