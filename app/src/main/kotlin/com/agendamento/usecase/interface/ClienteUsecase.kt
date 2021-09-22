package com.agendamento.usecase.`interface`

import com.agendamento.domain.Cliente

interface ClienteUsecase {

    fun getAllClientes(): List<Cliente>
    fun getCliente(id: Long): Cliente
    fun saveCliente(cliente: Cliente): Cliente
    fun deleteCliente(id: Long)

}