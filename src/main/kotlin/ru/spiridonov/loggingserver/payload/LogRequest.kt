package ru.spiridonov.loggingserver.payload

import jakarta.validation.constraints.NotBlank

data class LogRequest(
    @NotBlank
    val message: String,
    @NotBlank
    val date: Long
)
