package com.example.task_scheduler.controller;

import com.example.task_scheduler.entity.Task;
import com.example.task_scheduler.service.CompletionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/completion")
public class CompletionController {

    @Autowired
    private CompletionService completionService;

    /**
     * API to mark a task as completed
     * Example: PUT /completion/mark?taskId=1
     */
    @PutMapping("/mark")
    public ResponseEntity<Task> markTaskCompleted(@RequestParam Long taskId) {
        Task updatedTask = completionService.markTaskAsCompleted(taskId);
        return ResponseEntity.ok(updatedTask);
    }

    /**
     * API to get completion status of a task
     * Example: GET /completion/status/1
     */
    @GetMapping("/status/{taskId}")
    public ResponseEntity<String> getTaskStatus(@PathVariable Long taskId) {
        boolean completed = completionService.getTaskStatus(taskId);

        String status = completed ? "Task is completed" : "Task is pending";
        return ResponseEntity.ok(status);
    }
}
