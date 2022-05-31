package model;

public class Student {
    private String name;
    private String surname;
    private String gitLogin;

    public Student() {
    }

    public Student(String name, String surname, String gitLogin) {
        this.name = name;
        this.surname = surname;
        this.gitLogin = gitLogin;
    }

    public void getStudentFullName() {
        System.out.print(name + " " + surname + " (github: " + gitLogin + ") ");;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGitLogin(String gitLogin) {
        this.gitLogin = gitLogin;
    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public String getGitLogin() {
//        return gitLogin;
//    }
}