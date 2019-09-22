package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testMakeShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING,
                "Shopping task",
                "tea",
                "8.0");
        boolean beforeExecution = shopping.isTaskExecuted();
        shopping.executeTask();
        //Then
        Assert.assertEquals("Shopping task", shopping.getTaskName());
        Assert.assertFalse(beforeExecution);
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testMakePaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING,
                "Painting task", "red", "cat");
        boolean beforeExecution = painting.isTaskExecuted();
        painting.executeTask();
        //Then
        Assert.assertEquals("Painting task", painting.getTaskName());
        Assert.assertFalse(beforeExecution);
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testMakeDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING,
                "Driving task", "to home", "red cat");
        boolean beforeExecution = driving.isTaskExecuted();
        driving.executeTask();
        //Then
        Assert.assertEquals("Driving task", driving.getTaskName());
        Assert.assertFalse(beforeExecution);
        Assert.assertTrue(driving.isTaskExecuted());
    }

    @Test
    public void testNullTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task nullTask = taskFactory.makeTask("Null",
                "Null task", "", "");
        //Then
        Assert.assertNull(nullTask);
    }
}