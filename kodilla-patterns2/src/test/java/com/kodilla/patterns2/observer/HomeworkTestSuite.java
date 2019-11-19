package com.kodilla.patterns2.observer;

import com.kodilla.patterns2.observer.homework.Mentor;
import com.kodilla.patterns2.observer.homework.Student;
import com.kodilla.patterns2.observer.homework.Task;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void notifyAboutNewTask() {
        //given
        Task student1 = new Task(new Student("student1"));
        Task student2 = new Task(new Student("student2"));
        Task student3 = new Task(new Student("student3"));
        Mentor mentor1 = new Mentor("mentor1");
        Mentor mentor2 = new Mentor("mentor2");

        student1.registerObserver(mentor1);
        student2.registerObserver(mentor1);
        student3.registerObserver(mentor2);

        //when
        student1.addTaskToQueue("Test1");
        student3.addTaskToQueue("Test12");
        student1.addTaskToQueue("Test123");
        student1.addTaskToQueue("Test1234");
        student2.addTaskToQueue("Test12345");
        student3.addTaskToQueue("Test123456");

        //then
        assertEquals(4, mentor1.getUpdateCount());
        assertEquals(2, mentor2.getUpdateCount());
        assertEquals(1, student2.getExercises().size());
        assertEquals(2, student3.getExercises().size());
        assertEquals(3, student1.getExercises().size());
    }
}

