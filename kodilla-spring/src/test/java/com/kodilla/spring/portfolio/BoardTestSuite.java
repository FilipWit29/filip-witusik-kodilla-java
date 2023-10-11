package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        TaskList toDoList = board.getToDoList();
        TaskList inProgressList = board.getInProgressList();
        TaskList doneList = board.getDoneList();

        toDoList.getTasks().add("Task to do");
        inProgressList.getTasks().add("Task in progress");
        doneList.getTasks().add("Task done");
        //Then
        assertEquals("Task to do", board.getToDoList().getTasks().get(0));
        assertEquals("Task in progress", board.getInProgressList().getTasks().get(0));
        assertEquals("Task done", board.getDoneList().getTasks().get(0));
    }
}
