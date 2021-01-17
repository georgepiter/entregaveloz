/* Classe Restcontroller ou Endpoint */
package com.entrega.veloz.resources;

import javax.persistence.EntityManager;
import com.entrega.veloz.domain.Cliente;
import com.entrega.veloz.dto.ClienteDto;
import com.entrega.veloz.services.ClienteService;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
@RequestMapping(value = "cliente")
public class ClienteResource {

    @Autowired
    private ClienteService clienteService;

    @PersistenceContext
    private EntityManager manager;

    @GetMapping("/{id}")
    public ClienteDto clientesDto(@PathVariable Long id) {
        Cliente cliente = this.clienteService.buscarClientePorId(id);
        return new ClienteDto(cliente);
    }
 }
    

