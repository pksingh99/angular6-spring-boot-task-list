package com.jaredselling.tasks.controllers;

import com.jaredselling.tasks.domain.Task;
import com.jaredselling.tasks.services.TaskServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskServiceImpl taskService;

    public TaskController(TaskServiceImpl taskService) {
        this.taskService = taskService;
    }

    @GetMapping({"", "/"})
    public Iterable<Task> list() {
        return this.taskService.list();
    }



}
