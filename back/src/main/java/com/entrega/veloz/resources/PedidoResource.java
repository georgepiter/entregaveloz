/* Classe Restcontroller ou Endpoint */
package com.entrega.veloz.resources;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.entrega.veloz.domain.Pedido;
import com.entrega.veloz.dto.PedidoDto;
import com.entrega.veloz.services.PedidoServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
@RequestMapping(value = "pedido")
public class PedidoResource {

    @Autowired
    private PedidoServiceImp pedidoServiceImp;

    @PersistenceContext
    private EntityManager manager;

    @GetMapping("/{id}")
    public PedidoDto pedidosDto(@PathVariable Long id) {
        Pedido pedido = this.pedidoServiceImp.buscarPedidoPorId(id);
        return new PedidoDto(pedido);
    }
 }
    
