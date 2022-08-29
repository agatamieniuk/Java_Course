package com.example.todolist.controller;

import com.example.todolist.enums.Category;
import com.example.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("task")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("task-checker")
    public String getName(Model model) {
        model.addAttribute("todo", taskService.getTheMostUrgent());
        return "task-checker";
    }
}
