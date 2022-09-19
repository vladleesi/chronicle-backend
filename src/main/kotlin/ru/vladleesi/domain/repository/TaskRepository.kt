package ru.vladleesi.domain.repository

import ru.vladleesi.domain.entity.Task

interface TaskRepository {
    fun getTaskList(): List<Task>
}