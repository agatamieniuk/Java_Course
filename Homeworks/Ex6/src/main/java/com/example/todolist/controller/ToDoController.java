package com.example.todolist.controller;

import com.example.todolist.entity.ToDo;
import com.example.todolist.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping("index")
    public String listOfToDo(Model model) {
        model.addAttribute("todo", toDoService.printToDo());
        return "index";
    }

    @GetMapping("/new")
    public String getToDoForm(Model model) {
        model.addAttribute("todo", new ToDo());
        return "todo-form";
    }

    @PostMapping("/new")
    public String addToDo(@Valid @ModelAttribute("todo") ToDo toDo, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return "todo-form";
        }
        toDoService.saveToDo(toDo);
        return "redirect:/index";
    }
}
