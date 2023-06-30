package ru.spiridonov.loggingserver.repository

import org.springframework.data.jpa.repository.JpaRepository
import ru.spiridonov.loggingserver.models.Log

interface LogRepository : JpaRepository<Log, Long> {
}