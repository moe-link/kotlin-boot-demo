package com.doporro.demo.result

import java.time.LocalDateTime

data class Result<Boolean>(
    val time: LocalDateTime = LocalDateTime.now(),
    val code: Int = 1,
    val message: String = "request success"
)

data class DataResult<Boolean, T>(
    val result: Result<Boolean>,
    val data: T
)
