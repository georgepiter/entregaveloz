/* Classe de serviço implemntação */
package com.entrega.veloz.services;

import java.util.Optional;

import com.entrega.veloz.domain.Pedido;
import com.entrega.veloz.exception.ObjectNotFoundException;
import com.entrega.veloz.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImp implements PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public Pedido buscarPedidoPorId(Long id) {
        Optional<Pedido> pedido = pedidoRepository.findById(id);
        if (pedido == null) {
            try {
                throw new ObjectNotFoundException(
                        "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName());
            } catch (ObjectNotFoundException e) {
                e.printStackTrace();
            }
        }
        return pedidoRepository.findById(id).orElseThrow(() -> new RuntimeException("Pedido não encontrato"));
    }
    
    
}
