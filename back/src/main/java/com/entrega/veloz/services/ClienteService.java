/* Classe de serviço principal */
package com.entrega.veloz.services;

import com.entrega.veloz.domain.Cliente;
import org.springframework.stereotype.Service;

@Service
public interface ClienteService {
    
    public Cliente buscarClientePorId(Long id);
}
