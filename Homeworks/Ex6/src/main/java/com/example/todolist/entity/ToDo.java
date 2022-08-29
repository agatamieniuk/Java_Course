package com.example.todolist.entity;

import com.example.todolist.enums.Category;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Future;
import java.time.LocalDate;

public class ToDo {
    private String description;
    private Category category;
    private Integer priority;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Future
    private LocalDate deadline;

    public ToDo() {
    }

    public ToDo(String description, Category category, Integer priority, LocalDate deadline) {
        this.description = description;
        this.category = category;
        this.priority = priority;
        this.deadline = deadline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "ToDoList{" +
                "Description='" + description + '\'' +
                ", category=" + category +
                ", priority=" + priority +
                ", deadline=" + deadline +
                '}';
    }
}
