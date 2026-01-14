package com.example.task_scheduler.service;

import com.example.task_scheduler.entity.Task;
import com.example.task_scheduler.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompletionService {

    @Autowired
    private TaskRepository taskRepository;

    /**
     * Mark a task as completed
     */
    public Task markTaskAsCompleted(Long taskId) {
        Optional<Task> optionalTask = taskRepository.findById(taskId);

        if (optionalTask.isPresent()) {
            Task task = optionalTask.get();
            task.setCompleted(true);
            return taskRepository.save(task);
        } else {
            throw new RuntimeException("Task not found with ID: " + taskId);
        }
    }

    /**
     * Get completion status of a task
     */
    public boolean getTaskStatus(Long taskId) {
        return taskRepository.findById(taskId)
                .map(Task::isCompleted)
                .orElseThrow(() -> new RuntimeException("Task not found with ID: " + taskId));
    }
}
