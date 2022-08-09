package com.example.web.repository;

import com.example.web.entity.Project;
import com.example.web.enums.Client;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ProjectRepository extends FakeRepository<Long, Project> {

    private static final int WEEKEND = 2;
    private final AtomicLong nextId = new AtomicLong(1L);

    @PostConstruct
    public void initDb() {
        Project threads = new Project();
        threads.setName("Threads");
        threads.setDescription("Use this area to describe your project. Lorem ipsum dolor sit amet.");
        threads.setDueDate(LocalDate.now().plusDays(WEEKEND));
        threads.setClient(Client.ABC);
        threads.setCategory("Illustration");
        threads.setActive(true);
        save(threads);

        Project explore = new Project();
        explore.setName("Explore");
        explore.setDescription("Use this area to describe your project. Lorem ipsum dolor sit amet.");
        explore.setDueDate(LocalDate.now().minusDays(WEEKEND));
        explore.setClient(Client.BCD);
        explore.setCategory("Graphic Design");
        explore.setActive(false);
        save(explore);

        Project lines = new Project();
        lines.setName("Lines");
        lines.setDescription("Use this area to describe your project. Lorem ipsum dolor sit amet.");
        lines.setDueDate(LocalDate.now().minusDays(WEEKEND));
        lines.setClient(Client.CDE);
        lines.setCategory("Graphic Branding");
        lines.setActive(false);
        save(lines);

    }

    @Override
    Long nextId() {
        return nextId.getAndIncrement();
    }
}