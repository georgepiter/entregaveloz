package com.entrega.veloz.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @Id
    @Column(name = "id_pedido")
    private Long id;

    @Column(name = "data_postagem")
    private Date postagem;

    @Column(name = "data_transporte")
    private Date transporte;

    @Column(name = "data_entrega")
    private Date entrega;

    @Column(name = "observacao")
    private String observacao;
   
    public Pedido(Long id, Date postagem, Date transporte, Date entrega, String observacao) {
        this.id = id;
        this.postagem = postagem;
        this.transporte = transporte;
        this.entrega = entrega;
        this.observacao = observacao;
    }

    public Pedido() {
    }

    public Long getId() {
        return id;
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pedido other = (Pedido) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Pedido [entrega=" + entrega + ", id=" + id + ", observacao=" + observacao + ", postagem=" + postagem
                + ", transporte=" + transporte + "]";
    }
    
}

