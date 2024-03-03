package org.example.todoapp

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class TodoControllerTests : DescribeSpec ({
    it("my first test") {
        var task = Task("1", "Hello!")

        task.id shouldBe "1"
        1 + 2 shouldBe 3
    }
})