package org.example.todoapp

import org.springframework.web.bind.annotation.*

@RestController
class TodoController(val service: TaskService) {
    @GetMapping("/")
    fun index(): List<Task> = service.findTasks()

    @GetMapping("/{id}")
    fun index(@PathVariable id: String): List<Task> =
        service.findTaskById(id)

    @GetMapping("/tasks")
    fun tasks() = listOf(
        Task("1", "Hello!"),
        Task("2", "Bonjour!"),
        Task("3", "Privet!"),
    )

    @PostMapping("/")
    fun post(@RequestBody task: Task) {
        service.save(task)
    }
}