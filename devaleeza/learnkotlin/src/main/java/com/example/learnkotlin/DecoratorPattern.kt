package com.learning.learnkotlin

import java.util.UUID

// 1. Component Interface (Bilkul Unique Name)
fun interface DecoLogger {
    fun log(message: String)
}

// 2. Base Implementation using Lambda Expression
val decoConsoleLogger = DecoLogger { println(it) }

// 3. Extension Functions (Decorator Pattern - Modern Kotlin Way)
fun DecoLogger.withUniqueId(): DecoLogger = DecoLogger { message ->
    this.log("{${UUID.randomUUID()}} $message")
}

fun DecoLogger.withThreadName(): DecoLogger = DecoLogger { message ->
    this.log("$message (on ${Thread.currentThread().name} thread)")
}

fun DecoLogger.withDateTime(): DecoLogger = DecoLogger { message ->
    this.log("[2024-08-21T10:00:00] $message")
}

// 4. Main Function (Single File Entry Point)
fun main() {
    val logger = decoConsoleLogger
        .withDateTime()
        .withThreadName()
        .withUniqueId()

    logger.log("Application initialized")
}