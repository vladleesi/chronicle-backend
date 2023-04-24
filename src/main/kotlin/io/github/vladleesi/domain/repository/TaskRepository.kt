package io.github.vladleesi.domain.repository

import io.github.vladleesi.domain.entity.Task

interface TaskRepository {
    fun getTaskList(): List<Task>
}