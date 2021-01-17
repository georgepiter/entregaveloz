package com.entrega.veloz.repositories;

import java.util.Optional;
import com.entrega.veloz.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
    public Optional<Cliente> findById(Long id);
}
