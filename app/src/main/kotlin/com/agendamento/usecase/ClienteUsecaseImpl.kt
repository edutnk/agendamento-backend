package com.agendamento.usecase

import com.agendamento.domain.Cliente
import com.agendamento.usecase.`interface`.ClienteUsecase
import org.springframework.stereotype.Service

@Service
class ClienteUsecaseImpl : ClienteUsecase {

    override fun getAllClientes(): List<Cliente> {
        TODO("Not yet implemented")
    }

    override fun getCliente(id: Long): Cliente {
        TODO("Not yet implemented")
    }

    override fun saveCliente(cliente: Cliente): Cliente {
        TODO("Not yet implemented")
    }

    override fun deleteCliente(id: Long) {
        TODO("Not yet implemented")
    }
}

