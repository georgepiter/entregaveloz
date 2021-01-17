package com.entrega.veloz.repositories;

import java.util.Optional;
import com.entrega.veloz.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    
    public Optional<Pedido> findById(Long id);
}
