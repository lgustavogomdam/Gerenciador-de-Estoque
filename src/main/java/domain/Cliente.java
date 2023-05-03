/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author gugag
 */
public class Cliente {
    
    private int idCliente;
    private String nome;
    private String cpf;
    private String telefone;
    private Endereco endereco;

    public Cliente(String nomeCliente, String cpf, String numeroTelefone, Endereco enderecoCliente) {
        this.nome = nomeCliente;
        this.cpf = cpf;
        this.telefone = numeroTelefone;
        this.endereco = enderecoCliente;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    
}
