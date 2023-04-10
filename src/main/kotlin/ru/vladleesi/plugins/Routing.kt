package ru.vladleesi.plugins

import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import ru.vladleesi.data.repository.TaskRepositoryImpl
import ru.vladleesi.domain.entity.AboutEntity
import ru.vladleesi.domain.entity.TaskPage

fun Application.configureRouting() {

    // TODO: Move to DI
    val repo = TaskRepositoryImpl()

    routing {
        get("/about") {
            call.respond(AboutEntity("Some text"))
        }
        get("/task-page") {
            call.respond(
                TaskPage(
                    title = "Задачи",
                    taskList = repo.getTaskList(),
                    taskCountPerPage = 15
                )
            )
        }
//        authenticate("auth-oauth-google") {
//            post("/login") {
//
//            }
//        }
    }
}
