package com.example.web.controller;

import com.example.web.dto.ProjectDto;
import com.example.web.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/projects/{id}")
    public String getProject(@PathVariable Long id, Model model) {
        ProjectDto projectDto = projectService.find(id);
        model.addAttribute("project", projectDto);
        return "project";
    }
}