/* Classe DTO */
package com.entrega.veloz.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.entrega.veloz.domain.Cliente;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private String telefone;
    private String cpf;
    private String endereco;
    private String bairro;
    private String cep;
    private String estado;
    private String cidade;
    private Integer numero;

    private List<PedidoDto> pedidos = new ArrayList<>();

    public ClienteDto(Cliente clienteDtoObj) {   

        id = clienteDtoObj.getId();
        nome = clienteDtoObj.getNome();
        endereco = clienteDtoObj.getEndereco();
        bairro = clienteDtoObj.getBairro();
        cep = clienteDtoObj.getCep();
        estado = clienteDtoObj.getEstado();
        cidade = clienteDtoObj.getCidade();
        numero = clienteDtoObj.getNumero();
        cpf = clienteDtoObj.getCpf();
        telefone = clienteDtoObj.getTelefone();

        this.pedidos = clienteDtoObj.getPedidos().stream().map(e -> new PedidoDto(e)).collect(Collectors.toList());
        
    }

    public List<PedidoDto> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<PedidoDto> pedidos) {
        this.pedidos = pedidos;
    }

}  
   
   

    

    
   
