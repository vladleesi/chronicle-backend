package dev.vladleesi

import dev.vladleesi.plugins.configureRouting
import dev.vladleesi.plugins.configureSecurity
import dev.vladleesi.plugins.configureSerialization
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    // TODO: Replace to flavors
    val post: Int = System.getenv("PORT")?.toInt() ?: 8080
    embeddedServer(Netty, port = post) {
        configureRouting()
        configureSecurity()
        configureSerialization()
    }.start(wait = true)
}
