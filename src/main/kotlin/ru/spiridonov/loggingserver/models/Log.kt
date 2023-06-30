package ru.spiridonov.loggingserver.models

import jakarta.persistence.*

@Entity
@Table(name = "logs")
data class Log(
    @field:Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,
    val message: String,
    val date: Long
)
