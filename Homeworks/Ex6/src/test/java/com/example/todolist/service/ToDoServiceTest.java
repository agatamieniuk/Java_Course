package com.example.todolist.service;

import com.example.todolist.entity.ToDo;
import com.example.todolist.enums.Category;
import com.example.todolist.repository.ToDoRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.*;

@SpringBootTest
class ToDoServiceTest {

    @Autowired
    ToDoRepository toDoRepository;
    @Autowired
    ToDoService toDoService;

    @BeforeEach
    void beforeEach() {
        //given
        ToDo toDo = new ToDo("Jedzenie", Category.DOM, 5, LocalDate.of(2022, 12, 8));
        toDoService.saveToDo(toDo);
        ToDo toDo2 = new ToDo("Spanie", Category.DOM, 4, LocalDate.of(2022, 10, 10));
        toDoService.saveToDo(toDo2);
        ToDo toDo3 = new ToDo("Mailowanie", Category.PRACA, 1, LocalDate.of(2022, 11, 1));
        toDoService.saveToDo(toDo3);
        ToDo toDo4 = new ToDo("Liczenie", Category.PRACA, 1, LocalDate.of(2022, 11, 3));
        toDoService.saveToDo(toDo4);
    }

    @AfterEach
    void afterEach() {
        toDoService.printToDo().removeAll(toDoService.printToDo());
    }

    @Test
    void getHighestPriority() {
        //given and when
        List<ToDo> methodChecker = toDoService.getHighestPriority();
        //than
        assertThat(methodChecker)
                .hasSize(2)
                .containsOnly(toDoService.printToDo().get(2), toDoService.printToDo().get(3));
    }

    @Test
    void getHighestPriorityWithNull() {
        //given and when
        toDoService.saveToDo(new ToDo("Myślenie", Category.PRACA, null, LocalDate.of(2022, 12, 3)));
        //than
        assertThatNullPointerException()
                .isThrownBy(() -> toDoService.getHighestPriority());
    }

    @Test
    void getNextDay() {
        //given
        toDoService.saveToDo(new ToDo("Liczenie", Category.PRACA, 1, LocalDate.now().plusDays(1)));
        //when
        List<ToDo> methodChecker = toDoService.getNextDay();
        //then
        assertThat(methodChecker)
                .hasSizeGreaterThanOrEqualTo(1)
                .contains(toDoService.printToDo().get(4));
    }

    @Test
    void getNextDayIsEmpty() {
        //given and when
        List<ToDo> methodChecker = toDoService.getNextDay();
        //then
        assertThat(methodChecker)
                .isInstanceOf(ArrayList.class)
                .isNotNull()
                .isEmpty();
    }

    @Test
    void getPriority() {
        //given and when
        List<ToDo> methodChecker = toDoService.getPriority();
        //then
        assertThat(methodChecker)
                .isSortedAccordingTo(Comparator.comparing(ToDo::getPriority))
                .doesNotContainNull()
                .contains(toDoService.printToDo().get(0), toDoService.printToDo().get(1), toDoService.printToDo().get(2), toDoService.printToDo().get(3))
                .size().isEqualTo(toDoService.printToDo().size());
    }

    @Test
    void getPriorityWithNull() {
        //given and when
        toDoService.saveToDo(new ToDo("Myślenie", Category.PRACA, null, LocalDate.of(2022, 12, 3)));
        //than
        assertThatNullPointerException()
                .isThrownBy(() -> toDoService.getPriority());
    }

    @Test
    void getTheEarliest() {
        //given and when
        List<ToDo> methodChecker = toDoService.getTheEarliest();
        //then
        assertThat(methodChecker)
                .isSortedAccordingTo(Comparator.comparing(ToDo::getDeadline))
                .doesNotContainNull()
                .contains(toDoService.printToDo().get(0), toDoService.printToDo().get(1), toDoService.printToDo().get(2), toDoService.printToDo().get(3))
                .size().isEqualTo(toDoService.printToDo().size());
    }

    @Test
    void getTheEarliestWithNull() {
        //given and when
        toDoService.saveToDo(new ToDo("Myślenie", Category.DOM, 2, null));
        //than
        assertThatNullPointerException()
                .isThrownBy(() -> toDoService.getTheEarliest());
    }

    @Test
    void getCategory() {
        //given and when
        List<ToDo> methodChecker = toDoService.getCategory(Category.DOM);
        //then
        assertThat(methodChecker)
                .hasSize(2)
                .containsOnly(toDoService.printToDo().get(0), toDoService.printToDo().get(1))
                .isNotEqualTo(toDoService.printToDo());
    }

    @Test
    void getCategoryWithNull() {
        //given and when
        toDoService.saveToDo(new ToDo("Myślenie", null, 2, LocalDate.of(2022, 12, 10)));
        //than
        assertThatNullPointerException()
                .isThrownBy(() -> toDoService.getCategory(Category.DOM));
    }

    @Test
    void getName() {
        //given and when
        List<ToDo> methodChecker = toDoService.getName("ANI");
        //then
        assertAll("ANIE",
                () -> assertEquals("Spanie", methodChecker.get(0).getDescription()),
                () -> assertEquals("Mailowanie", methodChecker.get(1).getDescription()),
                () -> assertEquals(2, methodChecker.size())
        );
    }

    @Test
    void getEmptyName() {
        //given and when
        List<ToDo> methodChecker = toDoService.getName(" ");
        //then
        assertThat(methodChecker)
                .isInstanceOf(ArrayList.class)
                .isNotNull()
                .isEmpty();
    }

    @Test
    void getTheMostUrgent() {
        //given and when
        Optional<ToDo> methodChecker = toDoService.getTheMostUrgent();
        //then
        assertThat(methodChecker)
                .hasToString("Optional[ToDoList{Description='Mailowanie', category=PRACA, priority=1, deadline=2022-11-01}]")
                .isInstanceOf(Optional.class);
    }

    @Test
    void getTheMostUrgentWithNull() {
        //given and when
        toDoService.saveToDo(new ToDo("Myślenie", Category.DOM, null, null));
        //than
        assertThatNullPointerException()
                .isThrownBy(() -> toDoService.getTheMostUrgent());
    }

    @Test
    void getByCategory() {
        //given and when
        Map<Category, List<ToDo>> methodChecker = toDoService.getByCategory();
        //then
        assertThat(methodChecker)
                .hasSize(2)
                .containsOnlyKeys(Category.DOM, Category.PRACA)
                .isInstanceOf(Map.class);
    }

    @Test
    void getByCategoryWithNull() {
        //given and when
        toDoService.saveToDo(new ToDo("Myślenie", null, 2, LocalDate.of(2022, 12, 10)));
        //then
        assertThatNullPointerException()
                .isThrownBy(() -> toDoService.getByCategory());
    }

    @Test
    void getByPriority() {
        //given and when
        Map<Integer, List<ToDo>> methodChecker = toDoService.getByPriority();
        System.out.println(methodChecker);
        //then
        assertThat(methodChecker)
                .hasSize(3)
                .isInstanceOf(Map.class)
                .containsOnlyKeys(1, 4, 5);
    }

    @Test
    void getByPriorityWithNull() {
        //given and when
        toDoService.saveToDo(new ToDo("Myślenie", Category.PRACA, null, LocalDate.of(2022, 12, 10)));
        //then
        assertThatNullPointerException()
                .isThrownBy(() -> toDoService.getByPriority());
    }

    @Test
    void getByCategoryAndPriority() {
        //given and when
        Map<Category, Optional<ToDo>> methodChecker = toDoService.getByCategoryAndPriority();
        //then
        assertThat(methodChecker)
                .hasSize(2)
                .isInstanceOf(Map.class)
                .containsOnlyKeys(Category.DOM, Category.PRACA);
    }

    @Test
    void getByCategoryAndPriorityWithNull() {
        //given and when
        toDoService.saveToDo(new ToDo("Myślenie", null, 1, LocalDate.of(2022, 12, 10)));
        //then
        assertThatNullPointerException()
                .isThrownBy(() -> toDoService.getByCategoryAndPriority());
    }
}