package ru.vladleesi

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import ru.vladleesi.plugins.configureRouting
import ru.vladleesi.plugins.configureSecurity
import ru.vladleesi.plugins.configureSerialization

fun main() {
    embeddedServer(Netty, port = System.getenv("PORT").toInt()) {
        configureRouting()
        configureSecurity()
        configureSerialization()
    }.start(wait = true)
}
