package agendamento.controller;

import agendamento.domain.Cliente;
import agendamento.service.ClienteService;
import ch.qos.logback.core.net.server.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/teste")
    public String teste() {
        return "it works";
    }

    @GetMapping("/{id}")
    public Cliente findOneCliente(@PathVariable Long id) {
        return clienteService.findOneCliente(id);
    }

    @GetMapping
    public List<Cliente> findAllCliente() {
        return clienteService.findAllClientes();
    }

    @PostMapping
    public Cliente saveCliente(@RequestBody Cliente request) {
        return clienteService.saveCliente(request);
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Long id) {
        clienteService.deleteCliente(id);
    }



}
