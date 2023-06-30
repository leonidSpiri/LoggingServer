package ru.spiridonov.loggingserver.service

import org.springframework.stereotype.Service
import ru.spiridonov.loggingserver.models.Log
import ru.spiridonov.loggingserver.payload.LogRequest
import ru.spiridonov.loggingserver.repository.LogRepository

@Service
class LogService(val logRepository: LogRepository) {

    fun addLog(log: LogRequest) = logRepository.save(
        Log(
            message = log.message,
            date = log.date,
        )
    )

    fun getAllLogs(): Iterable<Log> = logRepository.findAll().sortedBy { it.date }
}