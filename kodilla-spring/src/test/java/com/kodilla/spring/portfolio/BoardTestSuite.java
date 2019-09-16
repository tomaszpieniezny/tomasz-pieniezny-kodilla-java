package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(value = "spring.main.allow-bean-definition-overriding=true")
public class BoardTestSuite {

    @Test
    public void testShowBoard() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When&Then
        System.out.println(board.toString());
    }

    @Test
    public void testAddOneTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask("Test getToDoList");
        board.getInProgressList().addTask("Test getInProgressList");
        board.getDoneList().addTask("Test getDoneList");
        //Then
        Assert.assertEquals("Test getToDoList", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("Test getInProgressList", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("Test getDoneList", board.getDoneList().getTasks().get(0));
    }
}