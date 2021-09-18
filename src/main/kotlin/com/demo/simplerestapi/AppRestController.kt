package com.demo.simplerestapi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AppRestController {

    @GetMapping("/go")
    fun go(): String{
        return "Gone!!!"
    }

}