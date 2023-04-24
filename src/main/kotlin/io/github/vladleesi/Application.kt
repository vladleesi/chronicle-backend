package io.github.vladleesi

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.github.vladleesi.plugins.configureRouting
import io.github.vladleesi.plugins.configureSecurity
import io.github.vladleesi.plugins.configureSerialization

fun main() {
    // TODO: Replace to flavors
    val post: Int = System.getenv("PORT")?.toInt() ?: 8080
    embeddedServer(Netty, port = post) {
        configureRouting()
        configureSecurity()
        configureSerialization()
    }.start(wait = true)
}
