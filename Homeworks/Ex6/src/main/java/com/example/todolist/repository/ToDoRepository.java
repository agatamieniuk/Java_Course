package com.example.todolist.repository;

import com.example.todolist.entity.ToDo;
import com.example.todolist.enums.Category;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ToDoRepository {
    private List<ToDo> list = new ArrayList<>();

    public List<ToDo> getList() {
        return list;
    }

    public ToDo saveToDo(ToDo toDo) {
        ToDo toDoToSave = new ToDo();
        toDoToSave.setDescription(toDo.getDescription());
        toDoToSave.setCategory(toDo.getCategory());
        toDoToSave.setPriority(toDo.getPriority());
        toDoToSave.setDeadline(toDo.getDeadline());

        list.add(toDoToSave);
        return toDoToSave;
    }
}
