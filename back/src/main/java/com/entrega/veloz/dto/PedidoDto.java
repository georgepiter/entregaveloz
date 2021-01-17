package com.entrega.veloz.dto;

import java.io.Serializable;
import java.util.Date;

import com.entrega.veloz.domain.Pedido;

public class PedidoDto implements Serializable {

    private static final long serialVersionUID = 1L;
        
    private Long id;
    private Date postagem;
    private Date transporte;
    private Date entrega;
    private String observacao;

    public PedidoDto() {
    }

    public PedidoDto(Pedido pedidoDtoObj) {

    id = pedidoDtoObj.getId();
    postagem = pedidoDtoObj.getPostagem();
    transporte = pedidoDtoObj.getTransporte();
    entrega = pedidoDtoObj.getEntrega();
    observacao = pedidoDtoObj.getObservacao();

    }

    public Date getPostagem() {
        return postagem;
    }

    public void setPostagem(Date postagem) {
        this.postagem = postagem;
    }

    public Date getTransporte() {
        return transporte;
    }

    public void setTransporte(Date transporte) {
        this.transporte = transporte;
    }

    public Date getEntrega() {
        return entrega;
    }

    public void setEntrega(Date entrega) {
        this.entrega = entrega;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "PedidoDto [entrega=" + entrega + ", id=" + id + ", observacao=" + observacao + ", postagem=" + postagem
                + ", transporte=" + transporte + "]";
    }
 



}
