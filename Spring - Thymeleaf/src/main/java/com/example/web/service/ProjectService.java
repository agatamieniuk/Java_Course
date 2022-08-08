package com.example.web.service;

import com.example.web.dto.ProjectDto;
import com.example.web.entity.Project;
import com.example.web.mappers.ProjectMapper;
import com.example.web.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    private final ProjectRepository repository;
    private final ProjectMapper mapper;

    @Autowired
    public ProjectService(ProjectRepository repository, ProjectMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public void create(ProjectDto dto) {
        Project project = mapper.toEntity(dto);
        repository.save(project);
    }

    public ProjectDto find(Long id) {
        Project project = repository.findById(id);
        return mapper.toDto(project);
    }
}
