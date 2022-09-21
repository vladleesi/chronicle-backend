package ru.vladleesi

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import ru.vladleesi.plugins.configureRouting
import ru.vladleesi.plugins.configureSecurity
import ru.vladleesi.plugins.configureSerialization

fun main() {
    // TODO: Replace to flavors
    val post: Int = System.getenv("PORT")?.toInt() ?: 8080
    embeddedServer(Netty, port = post) {
        configureRouting()
        configureSecurity()
        configureSerialization()
    }.start(wait = true)
}
