package com.example.web.controller;

import com.example.web.dto.ProjectDto;
import com.example.web.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProjectController {

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }


    @GetMapping("/projects/{id}")
    public String getProject(@PathVariable Long id, Model model) {
        model.addAttribute("project", projectService.find(id));
        return "project";
    }

    @GetMapping("/projects")
    public String getProjects(Model model) {
        model.addAttribute("projects", projectService.findAll());
        return "projects";
    }

    @GetMapping("/projects/new")
    public String getProjectForm(Model model) {
        model.addAttribute("project", new ProjectDto());
        return "project-form";
    }

    @PostMapping(value = "/projects/new")
    public String sendProject(@ModelAttribute("project") ProjectDto project) {
        projectService.create(project);
        return "project-form-success";
    }
}