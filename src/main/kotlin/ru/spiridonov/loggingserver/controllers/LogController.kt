package ru.spiridonov.loggingserver.controllers

import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import ru.spiridonov.loggingserver.payload.LogRequest
import ru.spiridonov.loggingserver.service.LogService

@CrossOrigin(origins = ["*"], maxAge = 3600)
@RestController
@RequestMapping("/api/log")
class LogController(private val logService: LogService) {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getAllLogs() = logService.getAllLogs()

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun addLog(@Valid @RequestBody log: LogRequest) = logService.addLog(log)
}