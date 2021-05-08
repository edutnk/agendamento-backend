package agendamento.converter;

import agendamento.domain.Cliente;
import agendamento.entity.ClienteEntity;
import org.springframework.stereotype.Service;

@Service
public class ClienteConverter {

    public ClienteEntity domainToEntity(Cliente request) {
        return ClienteEntity.builder()
                .id(request.getId() == null ? null : request.getId())
                .nome(request.getNome())
                .cpf(request.getCpf())
                .build();
    }

    public Cliente entityToDomain(ClienteEntity request) {
        return Cliente.builder()
                .id(request.getId())
                .nome(request.getNome())
                .cpf(request.getCpf())
                .build();
    }
}
