/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;


import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author gugag
 */

@Entity
public class Cliente implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idCliente;
    
    @Column (updatable = false, nullable = false, length = 50)
    private String nome;
    
    @Column (updatable = false, nullable = false, length = 11, unique = true)
    private String cpf;
    
    @Column (updatable = true, nullable = false, length = 11)
    private String telefone;
    
    @OneToMany ( mappedBy = "cliente",
                fetch = FetchType.LAZY)
    private List<Endereco> endereco;
    
    @OneToMany ( mappedBy = "cliente",
                fetch = FetchType.LAZY)
    private List<Pedido> pedido;

    public Cliente(String nomeCliente, String cpf, String numeroTelefone, List<Endereco> enderecoCliente) {
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

    public List<Endereco> getEndereco() {
        return this.endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }
    
    
    
}
