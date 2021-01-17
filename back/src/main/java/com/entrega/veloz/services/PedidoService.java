/* Classe de serviço principal */
package com.entrega.veloz.services;

import com.entrega.veloz.domain.Pedido;
import org.springframework.stereotype.Service;

@Service
public interface PedidoService {

    public Pedido buscarPedidoPorId(Long id);
    
}
