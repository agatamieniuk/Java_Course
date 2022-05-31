package model;

public class Grade {

    private Task task;
    private Student student;
    private int pointsScored;
    private String feedback;

    public Grade() {
    }

    public Grade(Task task, Student student, int pointsScored, String feedback){
        this.task = task;
        this.student = student;
        this.pointsScored = pointsScored;
        this.feedback = feedback;
    }

    public void setTaskNum(Task task) {
        this.task = task;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setPointsScored(int pointsScored) {
        this.pointsScored = pointsScored;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Task getTask() {
        return task;
    }

    public Student getStudent() {
        return student;
    }

    public int getPointsScored() {
        return pointsScored;
    }

    public String getFeedback() {
        return feedback;
    }
}