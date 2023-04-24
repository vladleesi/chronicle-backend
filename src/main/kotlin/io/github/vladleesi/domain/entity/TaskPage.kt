package io.github.vladleesi.domain.entity

import kotlinx.serialization.Serializable

@Serializable
data class TaskPage(
    val title: String,
    val taskList: List<Task>,
    val taskCountPerPage: Int
)
