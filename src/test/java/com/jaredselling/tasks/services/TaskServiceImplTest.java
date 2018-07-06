package com.jaredselling.tasks.services;

import com.google.common.collect.Iterables;
import com.jaredselling.tasks.domain.Task;
import com.jaredselling.tasks.repositories.TaskRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.util.HashSet;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class TaskServiceImplTest {
    TaskService taskService;

    @Mock
    TaskRepository taskRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        taskService = new TaskServiceImpl(taskRepository);
    }

    @Test
    public void testList() throws Exception {
        LocalDate localDate1 = LocalDate.of(2001,1,1);
        Task task1 = new Task(Long.valueOf(1), "test", localDate1, false);

        LocalDate localDate2 = LocalDate.of(2001,1,1);
        Task task2 = new Task(Long.valueOf(2), "test", localDate2, false);

        HashSet taskData = new HashSet();
        taskData.add(task1);
        taskData.add(task2);

        when(taskService.list()).thenReturn(taskData);

        Iterable<Task> tasks = taskService.list();

        assertEquals(Iterables.size(tasks), 2);
        verify(taskRepository, times(1)).findAll();
    }
}
