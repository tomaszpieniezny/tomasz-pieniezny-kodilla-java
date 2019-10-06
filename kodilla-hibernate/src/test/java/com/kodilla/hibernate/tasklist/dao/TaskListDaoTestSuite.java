package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList("Zadanie 13.2", DESCRIPTION);

        //When
        taskListDao.save(taskList);

        //Then
        String listName = "Zadanie 13.2";
        List<TaskList> readTaskList = taskListDao.findByListName(listName);
        Assert.assertEquals(listName, readTaskList.get(0).getListName());

        //CleanUp
        taskListDao.delete(taskList);

    }
}
