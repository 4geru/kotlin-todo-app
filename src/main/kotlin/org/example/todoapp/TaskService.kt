package org.example.todoapp

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.query
import org.springframework.stereotype.Service

@Service
class TaskService(val db: JdbcTemplate) {
    fun findTasks(): List<Task> = db.query("select * from Tasks") { response, _ ->
        Task(response.getString("id"), response.getString("text"))
    }
    fun findTaskById(id: String): List<Task> = db.query("select * from Tasks where id = ?", id) {
        response, _ -> Task(response.getString("id"), response.getString("text"))
    }
    fun save(Task: Task) {
        db.update(
            "insert into tasks values ( ?, ? )",
            Task.id, Task.text
        )
    }
}