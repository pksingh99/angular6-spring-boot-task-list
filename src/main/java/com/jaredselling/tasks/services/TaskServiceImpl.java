package com.jaredselling.tasks.services;

import com.jaredselling.tasks.domain.Task;
import com.jaredselling.tasks.repositories.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task saveTask(Task task) {
        return this.taskRepository.save(task);
    }
}
