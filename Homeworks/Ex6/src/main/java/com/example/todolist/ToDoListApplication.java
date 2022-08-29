package com.example.todolist;

import com.example.todolist.entity.ToDo;
import com.example.todolist.enums.Category;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class ToDoListApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToDoListApplication.class, args);
        ToDo toDo = new ToDo("Zjesc", Category.DOM, 2, LocalDate.of(2022, 8, 29));
        ToDo toDo2 = new ToDo("Spac", Category.DOM, 1, LocalDate.of(2022, 8, 30));
        ToDo toDo3 = new ToDo("Uczyc", Category.PRACA, 1, LocalDate.of(2022, 9, 3));
        ToDo toDo4 = new ToDo("Pisac", Category.PRACA, 3, LocalDate.of(2022, 10, 3));

        List<ToDo> todo = new ArrayList<>();
        todo.add(toDo);
        todo.add(toDo2);
        todo.add(toDo3);
        todo.add(toDo4);

        //    Metoda, która podzieli zadania według priorytetu i zwróci mapę (klucz: priorytet, wartość: lista zadań o danym priorytecie).

        Optional<ToDo> collect = todo.stream()
                .sorted(Comparator.comparing(ToDo::getDeadline))
                .sorted(Comparator.comparing(ToDo::getPriority)).findFirst();

        System.out.println(collect);
    }
}
