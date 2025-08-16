package com.personal.shisan.interfaces.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("users")
class UserController {
    @GetMapping("/{id}/")
    fun showUsers(@PathVariable("id") userId : String): String {
        println("this isunsafe")
        println(userId)
        return "index"
    }
}