package com.jaredselling.tasks.services;

import com.jaredselling.tasks.domain.Task;

public interface TaskService {
    Iterable<Task> list();
}
