package com.doporro.demo.controller

import com.doporro.demo.model.User
import com.doporro.demo.request.UserRequest
import com.doporro.demo.response.UserInfoResponse
import com.doporro.demo.response.UserLoginResponse
import com.doporro.demo.response.UserResponse
import com.doporro.demo.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = ["/user"])
class UserController(private val userService: UserService) {

    @GetMapping(path = ["/unit"])
    fun getUnit() = Unit

    @GetMapping(path = ["/homepage"])
    fun getHomePage() = "Welcome Home Page"

    @GetMapping(path = ["/list"])
    fun getAllDemos() : List<User> {
        return userService.getAllUsers()
    }

    @PostMapping(path = ["/login"])
    fun login(@RequestBody request: UserRequest) : UserLoginResponse {
        return UserLoginResponse(UserResponse("xxx"), "xx")
    }

    @GetMapping(path = ["/info"])
    fun get() : UserInfoResponse {
        return UserInfoResponse(UserResponse("xx"), "", "", 1, "")
    }

}