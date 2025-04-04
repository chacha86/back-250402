package com.example.back.domain.home.home.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @Value("\${custom.testValue}")
    private lateinit var testValue: String

    @GetMapping
    fun home(): String {
        return "Hello, World123, $testValue"
    }
}