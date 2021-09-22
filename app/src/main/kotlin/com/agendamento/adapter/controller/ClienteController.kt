package com.agendamento.adapter.controller

import com.agendamento.usecase.`interface`.ClienteUsecase
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ClienteController(
    private val usecase: ClienteUsecase
) {

    @GetMapping("/")
    fun getAllClientes() {
        usecase.getAllClientes()
    }

}