   /* Classe  de entidade pedido */
package com.entrega.veloz.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "pedido")
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;

    /* Mapeamento de classe */

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

}

