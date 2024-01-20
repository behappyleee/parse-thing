package com.example.parsething.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainRestController {

    @GetMapping("/test")
    fun testController(): String {
        return "THIS IS TESTs!"
    }

}