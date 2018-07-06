package com.jaredselling.tasks.controllers;

import com.jaredselling.tasks.services.TaskService;
import com.jaredselling.tasks.services.TaskServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class TaskControllerTest {
    @Mock
    TaskServiceImpl taskService;

    TaskController controller;

    MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup().build();
        controller = new TaskController(taskService);
    }

//    @Test
//    public void testList() throws Exception {
//        mockMvc.perform(get("/"))
//                .andExpect(status().isOk());
//    }
}
