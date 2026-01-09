package com.example.task_scheduler.controller;

import com.example.task_scheduler.entity.Task;
import com.example.task_scheduler.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public Task addTask(@RequestBody Task task) {
        return service.addTask(task);
    }

    @GetMapping("/list")
    public List<Task> listTasks() {
        return service.getAllTasks();
    }

    @PutMapping("/complete/{id}")
    public Task completeTask(@PathVariable Long id) {
        return service.markCompleted(id);
    }
}
