package dev.vladleesi.domain.repository

import dev.vladleesi.domain.entity.Task

interface TaskRepository {
    fun getTaskList(): List<Task>
}