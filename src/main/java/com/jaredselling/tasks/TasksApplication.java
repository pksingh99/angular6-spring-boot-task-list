package com.jaredselling.tasks;

import com.jaredselling.tasks.domain.Task;
import com.jaredselling.tasks.services.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sun.tools.jar.CommandLine;

import java.time.LocalDate;

@SpringBootApplication
public class TasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(TasksApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(TaskService taskService) {
        return args -> {
            taskService.saveTask(new Task(1L, "task1", LocalDate.now(), true));
            taskService.saveTask(new Task(2L, "task2", LocalDate.now(), false));
            taskService.saveTask(new Task(3L, "task3", LocalDate.now(), false));
            taskService.saveTask(new Task(4L, "task4", LocalDate.now(), false));
            taskService.saveTask(new Task(5L, "task5", LocalDate.now(), false));
            taskService.saveTask(new Task(6L, "task6", LocalDate.now(), false));
        };
    }
}
