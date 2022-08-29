package com.example.todolist.service;

import com.example.todolist.entity.ToDo;
import com.example.todolist.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    public ToDo saveToDo(ToDo toDo) {
        return toDoRepository.saveToDo(toDo);
    }

    public  List<ToDo> printToDo(){
        return  toDoRepository.getList();
    }


}
