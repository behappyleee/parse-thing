package com.example.parsething.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController {

    @GetMapping("/test/view")
    fun testView(model: Model): String {
        model.addAttribute("name", "hello it's me !")
        return "hello"
    }

}