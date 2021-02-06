/* Classe DTO */
package com.entrega.veloz.dto;

import java.io.Serializable;
import java.util.Date;

import com.entrega.veloz.domain.Pedido;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDto implements Serializable {

    private static final long serialVersionUID = 1L;
        
    private Long id;
    private Date postagem;
    private Date transporte;
    private Date entrega;
    private String observacao;
  
    public PedidoDto(Pedido pedidoDtoObj) {

    id = pedidoDtoObj.getId();
    postagem = pedidoDtoObj.getPostagem();
    transporte = pedidoDtoObj.getTransporte();
    entrega = pedidoDtoObj.getEntrega();
    observacao = pedidoDtoObj.getObservacao();
    
    } 
      

}
