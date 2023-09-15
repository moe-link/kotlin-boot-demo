package com.doporro.demo.service

import com.doporro.demo.model.User
import com.doporro.demo.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    fun getAllUsers(): List<User> {
        return userRepository.findAll();
    }

}