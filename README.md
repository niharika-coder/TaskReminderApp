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

## API Endpoints
| Endpoint | Method | Description |
|----------|--------|-------------|
| `/tasks/add` | POST | Add a new task |
| `/tasks/list` | GET | List all tasks |
| `/tasks/{id}` | PUT | Update task details |
| `/schedule/set` | POST | Set task reminder |
| `/reminders/{taskId}` | GET | Get reminder for a task |
| `/reports/export` | POST | Export task report as CSV |
| `/completion/mark` | PUT | Mark task as completed |
| `/status/{taskId}` | GET | Check task status |

---

## How to Run
1. Clone the repository:
```bash
git clone https://github.com/niharika-coder/TaskReminderApp.git
