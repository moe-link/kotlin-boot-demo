package com.doporro.demo.response

data class UserResponse(
    val userAccount: String,
)

data class UserLoginResponse(
    val userResponse: UserResponse,
    val userName: String
)

data class UserInfoResponse(
    val userResponse: UserResponse,
    val username: String,
    val userAvatar: String,
    val userSex: Int,
    val userEmail: String,
)