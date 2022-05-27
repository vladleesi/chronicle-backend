package ru.vladleesi

import io.ktor.server.engine.*
import io.ktor.server.cio.*
import ru.vladleesi.plugins.*

fun main() {
    embeddedServer(CIO, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSecurity()
    }.start(wait = true)
}
