package com.example.task_scheduler.controller;

import com.example.task_scheduler.service.CsvService;
import com.example.task_scheduler.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {

    private final TaskService taskService;
    private final CsvService csvService;

    public ReportController(TaskService taskService,
                            CsvService csvService) {
        this.taskService = taskService;
        this.csvService = csvService;
    }

    @GetMapping("/reports/export")
    public String exportCsv() throws Exception {
        csvService.exportToCsv(taskService.getAllTasks());
        return "CSV Exported Successfully";
    }
}
