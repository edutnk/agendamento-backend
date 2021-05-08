package agendamento.service;

import agendamento.converter.ClienteConverter;
import agendamento.domain.Cliente;
import agendamento.entity.ClienteEntity;
import agendamento.repository.ClienteRepository;
import javassist.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    ClienteConverter clienteConverter;

    public Cliente saveCliente(Cliente cliente) {
        ClienteEntity clienteEntity = clienteRepository.save(clienteConverter.domainToEntity(cliente));
        return clienteConverter.entityToDomain(clienteEntity);
    }

    public Cliente findOneCliente(Long id) {
        ClienteEntity clienteEntity = clienteRepository.findById(id).orElse(null);
        return clienteEntity == null ? null : clienteConverter.entityToDomain(clienteEntity);
    }

    public List<Cliente> findAllClientes() {
        // TODO PAGEABLE
        try {
            List<ClienteEntity> listaClienteEntity = clienteRepository.findAll();

            List<Cliente> listaCliente = new ArrayList<>();
//            listaClienteEntity.forEach( e ->
//                    listaCliente.add(clienteConverter.entityToDomain(e)));
            return listaClienteEntity.stream()
                    .map( e -> clienteConverter.entityToDomain(e)).collect(Collectors.toList());
        }catch (Exception e) {
            return null;
        }
    }

    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }



}
