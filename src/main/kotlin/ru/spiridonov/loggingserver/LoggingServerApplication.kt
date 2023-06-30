package ru.spiridonov.loggingserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LoggingServerApplication

fun main(args: Array<String>) {
    runApplication<LoggingServerApplication>(*args)
}
