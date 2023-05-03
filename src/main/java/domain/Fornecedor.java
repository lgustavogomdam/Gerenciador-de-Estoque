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
public class Fornecedor {
    
    private int idFornecedor;
    private String nome;
    private Endereco endereco;

    public Fornecedor(int idFornecedor, String nome, Endereco endereco) {
        this.idFornecedor = idFornecedor;
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
    
}
