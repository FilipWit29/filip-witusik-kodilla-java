package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryTasks() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        assertEquals("Buy", shoppingTask.getTaskName());
        assertFalse(paintingTask.isTaskExecuted());
        assertEquals("Warsaw", drivingTask.executeTask());
    }
}
