package com.entrega.veloz.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.entrega.veloz.domain.Cliente;

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

    public ClienteDto() {
    }

    public ClienteDto(Cliente clienteDtoObj) {

        id = clienteDtoObj.getId();
        nome = clienteDtoObj.getNome();
        endereco = clienteDtoObj.getEndereco();
        bairro = clienteDtoObj.getBairro();
        cep = clienteDtoObj.getCep();
        estado = clienteDtoObj.getEstado();
        cidade = clienteDtoObj.getCidade();
        numero = clienteDtoObj.getNumero();

        this.pedidos = clienteDtoObj.getPedidos().stream().map(e -> new PedidoDto(e)).collect(Collectors.toList());
        
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public List<PedidoDto> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<PedidoDto> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "ClienteDto [bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + ", cpf=" + cpf + ", endereco="
                + endereco + ", estado=" + estado + ", id=" + id + ", nome=" + nome + ", numero=" + numero
                + ", telefone=" + telefone + "]";
    }

}  
   
   

    

    
   
