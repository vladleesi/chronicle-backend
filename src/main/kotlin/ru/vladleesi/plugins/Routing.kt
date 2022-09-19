package ru.vladleesi.plugins

import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import ru.vladleesi.domain.entity.AboutEntity
import ru.vladleesi.domain.entity.Task
import ru.vladleesi.domain.entity.TaskPage

fun Application.configureRouting() {

    routing {
        get("/about") {
            call.respond(AboutEntity("Some text"))
        }
        get("/task-page") {
            call.respond(
                TaskPage(
                    title = "Задачи",
                    taskList = listOf(
                        Task(title = "Сделать дела", isCompleted = true),
                        Task(title = "Сделать другие дела", isCompleted = false),
                        Task(title = "Сделать еще какие то дела", isCompleted = false)
                    ),
                    taskCountPerPage = 15
                )
            )
        }
        authenticate("auth-oauth-google") {
            post("/login") {

            }
        }
    }
}
