package com.example.task_scheduler.service;

import com.example.task_scheduler.entity.Task;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.util.List;

@Service
public class CsvService {

    public void exportToCsv(List<Task> tasks) throws Exception {
        FileWriter writer = new FileWriter("tasks.csv");
        writer.write("ID,Title,Completed\n");

        for (Task task : tasks) {
            writer.write(task.getId() + "," +
                    task.getTitle() + "," +
                    task.isCompleted() + "\n");
        }
        writer.close();
    }
}
