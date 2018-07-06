package com.jaredselling.tasks.repositories;

import com.jaredselling.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
