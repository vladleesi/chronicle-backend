package io.github.vladleesi.domain.entity

import kotlinx.serialization.Serializable

@Serializable
data class Task(
    val title: String,
    val description: String? = null,
    val deadline: Long? = null,
    val isCompleted: Boolean
)
