package com.doporro.demo.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class User(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long  = 0,

    @Column(nullable = false)
    val name: String,
) {
    constructor() : this(0, "")
}


data class UserInfoResponse(
    val name: String,
)