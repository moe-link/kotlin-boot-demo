package com.doporro.demo.controller

import com.doporro.demo.model.User
import com.doporro.demo.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/user"])
class UserController(private val userService: UserService) {

    @GetMapping(path = ["/homepage"])
    fun getHomePage() = "Welcome Home Page"

    @GetMapping
    fun getAllDemos() : List<User> {
        return userService.getAllUsers()
    }

}