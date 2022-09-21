package ru.vladleesi.data.repository

import ru.vladleesi.domain.entity.Task
import ru.vladleesi.domain.repository.TaskRepository
import ru.vladleesi.utils.toTime

class TaskRepositoryImpl : TaskRepository {

    override fun getTaskList(): List<Task> {
        return listOf(
            Task(title = "Start something for beginning", isCompleted = true),
            Task(title = "Compose God", isCompleted = false, deadline = "10/02/2022 13:00".toTime()),
            Task(title = "Kotlin fullstack God", isCompleted = false, deadline = "10/10/2022 13:00".toTime())
        )
    }
}