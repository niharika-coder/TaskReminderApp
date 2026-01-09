package com.example.task_scheduler.service;

import com.example.task_scheduler.entity.Task;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Service
public class SchedulerService {

    private final ScheduledExecutorService scheduler =
            Executors.newScheduledThreadPool(1);

    private final EmailService emailService;

    public SchedulerService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void scheduleReminder(Task task) {
        long delay = Duration.between(
                LocalDateTime.now(),
                task.getDueDate()
        ).toMillis();

        if (delay > 0) {
            scheduler.schedule(() ->
                            emailService.sendEmail(
                                    task.getEmail(),
                                    "Task Reminder",
                                    "Reminder: " + task.getTitle()
                            ),
                    delay,
                    TimeUnit.MILLISECONDS
            );
        }
    }
}
