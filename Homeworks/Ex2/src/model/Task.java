package model;

public class Task {
    private int taskNumber;
    private String shortDescription;
    private int maxPoints;

    public Task() {
    }

    public Task(int taskNumber, String shortDescription, int maxPoints) {
        this.taskNumber = taskNumber;
        this.shortDescription = shortDescription;
        this.maxPoints = maxPoints;
    }

    public void getTaskDescription() {
        System.out.print("Task " + taskNumber + " (max " + maxPoints + " points): " + shortDescription);
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public void setMaxPoints(int maxPoints) {
        this.maxPoints = maxPoints;
    }

//    public int getTaskNumber() {
//        return taskNumber;
//    }
//
//    public String getShortDescription() {
//        return shortDescription;
//    }
//
//    public int getMaxPoints() {
//        return maxPoints;
//    }
}