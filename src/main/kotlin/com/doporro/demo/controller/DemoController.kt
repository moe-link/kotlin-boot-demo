package com.doporro.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/demo"])
class DemoController {

    @GetMapping(path = ["/homepage"])
    fun getHomePage() = "Welcome Home Page"

}