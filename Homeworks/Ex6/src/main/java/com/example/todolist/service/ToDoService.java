package com.example.todolist.service;

import com.example.todolist.entity.ToDo;
import com.example.todolist.enums.Category;
import com.example.todolist.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ToDoService {

    private ToDoRepository toDoRepository;

    @Autowired
    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public ToDo saveToDo(ToDo toDo) {
        return toDoRepository.saveToDo(toDo);
    }

    public  List<ToDo> printToDo(){
        return  toDoRepository.getList();
    }

    //    Metoda, która wyszuka wszystkie zadania z najwyższym priorytetem i zwróci ich listę (najwyższy priorytet: 1, najniższy: 5)
    public List<ToDo> getHighestPriority() {
        return toDoRepository.getList().stream()
                .filter(p -> p.getPriority().equals(1))
                .collect(Collectors.toList());
    }

    //    Metoda, która wyszuka wszystkie zadania na następny dzień i zwróci ich listę.
    public List<ToDo> getNextDay() {
        return toDoRepository.getList().stream()
                .filter(p -> p.getDeadline().equals(LocalDate.now().plusDays(1)))
                .collect(Collectors.toList());
    }

    //    Metoda, która posortuje zadania według malejącego priorytetu i zwróci posortowaną listę.
    public List<ToDo> getPriority() {
        return toDoRepository.getList().stream()
                .sorted(Comparator.comparing(ToDo::getPriority))
                .collect(Collectors.toList());
    }

    //    Metoda, która posortuje zadania według daty (najpierw najwcześniejsze) i zwróci posortowaną listę.
    public List<ToDo> getTheEarliest() {
        return toDoRepository.getList().stream()
                .sorted(Comparator.comparing(ToDo::getDeadline))
                .collect(Collectors.toList());
    }

    //    Metoda, która wyszuka wszystkie zadania dla danej kategorii (kategoria powinna być argumentem tej metody) i zwróci ich listę.
    public List<ToDo> getCategory(Category category) {
        return toDoRepository.getList().stream()
                .filter(p -> p.getCategory().equals(category))
                .collect(Collectors.toList());
    }

    //    Metoda, która wyszuka wszystkie zadania zawierające w opisie podaną frazę (bez uwzględniania wielkości liter) i zwróci ich listę.
    public List<ToDo> getName(String name) {
        return toDoRepository.getList().stream()
                .filter(p -> p.getDescription().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    //    Metoda, która wyszuka zadanie najpilniejsze (z najwcześniejszą datą i z najwyższym priorytetem dla danego terminu) i zwróci jedno takie zadanie (najlepiej jako Optional).
    public Optional<ToDo> getTheMostUrgent() {
        return toDoRepository.getList().stream()
                .sorted(Comparator.comparing(ToDo::getDeadline))
                .sorted(Comparator.comparing(ToDo::getPriority)).findFirst();
    }

    //    Metoda, która podzieli zadania według kategorii i zwróci mapę (klucz: kategoria, wartość: lista zadań dla danej kategorii).
    public Map<Category, List<ToDo>> getByCategory() {
        return toDoRepository.getList().stream()
                .collect(Collectors.groupingBy(p -> p.getCategory()));
    }

    //    Metoda, która podzieli zadania według priorytetu i zwróci mapę (klucz: priorytet, wartość: lista zadań o danym priorytecie).
    public Map<Integer, List<ToDo>> getByPriority() {
        return toDoRepository.getList().stream()
                .collect(Collectors.groupingBy(p -> p.getPriority()));
    }

//    Metoda, która znajdzie zadanie z najwyższym priorytetem dla każdej kategorii i zwróci mapę (klucz: kategoria, wartość: Optional).

    public Map<Category, Optional<ToDo>> getByCategoryAndPriority() {
        return toDoRepository.getList().stream()
                .collect(Collectors.groupingBy(ToDo::getCategory, Collectors.minBy(Comparator.comparingInt(ToDo::getPriority))));
    }


}
