package com.doporro.demo.request

import com.doporro.demo.response.UserResponse

data class UserRequest(
    val username: String,
)

data class UserLoginRequest(
    val userResponse: UserResponse,
    val userPassword: String
)