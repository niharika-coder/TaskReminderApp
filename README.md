# Java-Based Task Reminder Application

## Project Overview
This project implements a **Java-Based Task Reminder Application** using core Java concepts, Spring Boot RESTful APIs, and JDBC-based persistence. The system allows users to create tasks, schedule reminders, track completion status, generate reports, and export task data to CSV files (simulating Google Sheets).

The application focuses on **personal productivity and task organization** without using AI or heavy frameworks, ensuring simplicity, scalability, and reliability.

---

## Project Outcomes
- Reliable task scheduling and timely reminders using Java timers and concurrency features
- Accurate tracking of completed and pending tasks using database persistence
- CSV-based task reports for overview and analysis
- RESTful API-driven operations for web-based interaction
- Secure and structured backend using Spring Boot architecture

---

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA / JDBC
- H2 / MySQL Database
- ScheduledExecutorService
- JavaMail API
- CSV File Handling
- Maven
- Git & GitHub

---

## Module Implementation

### 1. Task Organization Engine
- Manages task creation, updates, and retrieval
- Uses Java Collections and JDBC persistence
- Exposes REST APIs for task operations

### 2. Scheduling System
- Schedules reminders based on task due dates
- Uses Java concurrency and timers
- Supports reminder queries via APIs

### 3. Overview & CSV Integration Hub
- Generates task overviews
- Exports reports to CSV files
- Simulates Google Sheets-style reporting

### 4. Completion Tracker
- Marks tasks as completed
- Provides completion status insights
- Exposes REST APIs for tracking and analytics

---

## REST API Endpoints

### Task Management APIs
| Method | Endpoint        | Description |
|------|-----------------|-------------|
| POST | /tasks/add      | Add a new task |
| GET  | /tasks/list     | Retrieve all tasks |
| PUT  | /tasks/{id}     | Update task details |

### Scheduling & Reminder APIs
| Method | Endpoint            | Description |
|------|---------------------|-------------|
| POST | /schedule/set       | Set reminder for a task |
| GET  | /reminders/{taskId} | Get reminder details |

### Report & CSV Export APIs
| Method | Endpoint          | Description |
|------|-------------------|-------------|
| GET  | /reports/overview | Get task summary |
| POST | /reports/export   | Export tasks to CSV |

### Completion Tracking APIs
| Method | Endpoint                   | Description |
|------|----------------------------|-------------|
| PUT  | /completion/mark           | Mark task as completed |
| GET  | /completion/status/{taskId} | Get task completion status |

---

## Sample API Responses

### Add Task – POST /tasks/add
```json
{
  "id": 1,
  "title": "Submit Assignment",
  "description": "Upload project to GitHub",
  "dueDate": "2026-01-20T18:00:00",
  "completed": false
}
