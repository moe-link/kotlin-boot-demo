package com.doporro.demo.model

import java.time.LocalDateTime

data class Result<Boolean>(
    val time: LocalDateTime = LocalDateTime.now(),
    val code: Int = 1,
    val message: String = "request success"
)

data class CommonStatus<Boolean, T>(
    val result: Result<Boolean>,
    val data: T
)