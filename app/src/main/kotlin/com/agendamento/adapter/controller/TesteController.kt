package com.agendamento.adapter.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TesteController {

    @GetMapping("/teste")
    fun testar(): String {
        return "it works"
    }
}