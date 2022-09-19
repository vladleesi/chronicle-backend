package ru.vladleesi.data.repository

import ru.vladleesi.domain.entity.Task
import ru.vladleesi.domain.repository.TaskRepository

class TaskRepositoryImpl: TaskRepository {

    override fun getTaskList(): List<Task> {
        return listOf(
            Task(title = "Сделать дела", isCompleted = true),
            Task(title = "Сделать другие дела", isCompleted = false),
            Task(title = "Сделать еще какие то дела", isCompleted = false)
        )
    }
}