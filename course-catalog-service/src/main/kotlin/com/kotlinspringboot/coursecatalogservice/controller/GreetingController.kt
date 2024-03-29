package com.kotlinspringboot.coursecatalogservice.controller

import com.kotlinspringboot.coursecatalogservice.service.GreetingService
import io.klogging.Klogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/greetings")
class GreetingController(val greetingService: GreetingService) {
    @GetMapping("/{name}")
    fun retrieveGreeting(@PathVariable("name") name: String): String {
//       return "Hello $name"
        return greetingService.retrieveGreeting(name)
    }
}