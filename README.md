# Task Reminder Application

## Project Description
This is a **Java-Based Task Reminder Application** built using **Spring Boot**, **JDBC**, and **Java core features** like Collections and ScheduledExecutorService.  
It allows users to:
- Add tasks with titles and due dates
- Track task completion
- Set reminders via timers
- Generate CSV reports of tasks
- Send email notifications

The application exposes **RESTful APIs** for all operations.

---

## Technologies Used
- Java 17+
- Spring Boot
- MySQL / H2 (JDBC)
- Maven / Gradle
- JavaMail API
- Postman for API testing
- CSV integration

---

## REST API Endpoints

The application exposes RESTful APIs using Spring Boot controllers to manage tasks, scheduling, reports, and completion tracking.

### Task Management APIs
| Method | Endpoint        | Description                 |
|------|-----------------|-----------------------------|
| POST | /tasks/add      | Add a new task              |
| GET  | /tasks/list     | Retrieve all tasks          |
| PUT  | /tasks/{id}     | Update task details         |

### Scheduling & Reminder APIs
| Method | Endpoint                | Description                       |
|------|-------------------------|-----------------------------------|
| POST | /schedule/set           | Set reminder for a task           |
| GET  | /reminders/{taskId}     | Get reminder details for a task   |

### Report & CSV Export APIs
| Method | Endpoint               | Description                         |
|------|------------------------|-------------------------------------|
| GET  | /reports/overview      | Get task summary overview           |
| POST | /reports/export        | Export task report to CSV file      |

### Completion Tracking APIs
| Method | Endpoint               | Description                         |
|------|------------------------|-------------------------------------|
| PUT  | /completion/mark       | Mark task as completed              |
| GET  | /completion/status/{taskId} | Get task completion status |


---

## How to Run
1. Clone the repository:
```bash
git clone https://github.com/niharika-coder/TaskReminderApp.git
