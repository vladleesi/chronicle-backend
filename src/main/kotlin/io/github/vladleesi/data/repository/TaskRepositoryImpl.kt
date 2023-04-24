package io.github.vladleesi.data.repository

import io.github.vladleesi.domain.entity.Task
import io.github.vladleesi.domain.repository.TaskRepository
import io.github.vladleesi.utils.toTime

class TaskRepositoryImpl : TaskRepository {

    override fun getTaskList(): List<Task> {
        return listOf(
            Task(title = "Start something for beginning", isCompleted = true),
            Task(title = "Compose God", isCompleted = false, deadline = "10/02/2022 13:00".toTime()),
            Task(title = "Kotlin fullstack God", isCompleted = false, deadline = "10/10/2022 13:00".toTime())
        )
    }
}