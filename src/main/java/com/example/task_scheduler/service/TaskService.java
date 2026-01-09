package com.example.task_scheduler.service;

import com.example.task_scheduler.entity.Task;
import com.example.task_scheduler.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repository;
    private final SchedulerService schedulerService;

    public TaskService(TaskRepository repository,
                       SchedulerService schedulerService) {
        this.repository = repository;
        this.schedulerService = schedulerService;
    }

    public Task addTask(Task task) {
        Task saved = repository.save(task);
        schedulerService.scheduleReminder(saved);
        return saved;
    }

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Task markCompleted(Long id) {
        Task task = repository.findById(id).orElseThrow();
        task.setCompleted(true);
        return repository.save(task);
    }
}
