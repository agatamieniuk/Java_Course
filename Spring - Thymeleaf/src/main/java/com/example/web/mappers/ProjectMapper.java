package com.example.web.mappers;

import com.example.web.dto.ProjectDto;
import com.example.web.entity.Project;
import org.springframework.stereotype.Component;

@Component
public class ProjectMapper {

    public ProjectDto toDto(Project project) {
        ProjectDto dto = new ProjectDto();
        dto.setId(project.getId());
        dto.setName(project.getName());
        dto.setDescription(project.getDescription());
        dto.setDueDate(project.getDueDate());
        dto.setClient(project.getClient());
        dto.setCategory(project.getCategory());
        dto.setActive(project.getActive());
        return dto;
    }

    public Project toEntity(ProjectDto project) {
        Project entity = new Project();
        entity.setId(project.getId());
        entity.setName(project.getName());
        entity.setDescription(project.getDescription());
        entity.setDueDate(project.getDueDate());
        entity.setClient(project.getClient());
        entity.setCategory(project.getCategory());
        entity.setActive(project.getActive());
        return entity;
    }
}
