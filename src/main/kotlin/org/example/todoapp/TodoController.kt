package org.example.todoapp

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

data class Task(val id: String?, val text: String)

@RestController
class TodoController {
    @GetMapping("/")
    fun index(@RequestParam("name") name: String) = "Hello, $name-san!"

    @GetMapping("/tasks")
    fun index() = listOf(
        Task("1", "Hello!"),
        Task("2", "Bonjour!"),
        Task("3", "Privet!"),
    )
}