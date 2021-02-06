/* Classe de serviço implemntação */
package com.entrega.veloz.services;

import java.util.Optional;

import com.entrega.veloz.domain.Cliente;
import com.entrega.veloz.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ClienteServiceImp implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente buscarClientePorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if(cliente == null) {
            try {
                throw new ObjectNotFoundException(
                    "Cliente não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()); 
            }
            catch (ObjectNotFoundException e) {
                    e.printStackTrace();
            }
        }
        return clienteRepository.findById(id).orElseThrow(() -> new RuntimeException("Cliente não localizado"));
    }
    
}
