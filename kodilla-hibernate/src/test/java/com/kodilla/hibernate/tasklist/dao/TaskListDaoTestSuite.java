package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "Test";
    @Test
    void testFindByListName() {
    //Given
        TaskList taskList = new TaskList(LISTNAME,"Description");
        taskListDao.save(taskList);
        String listname = taskList.getListName();
        //When
        List<TaskList> readList = taskListDao.findByListName(listname);
        //Then
        assertEquals(LISTNAME, readList.get(0).getListName());

        //CleanUp
        int id = readList.get(0).getId();
        taskListDao.deleteById(id);
    }
}
