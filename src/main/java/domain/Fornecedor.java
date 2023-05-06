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
public class Fornecedor implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idFornecedor;
    
    @Column (updatable = false, nullable = false, length = 30)
    private String nome;
    
    @ManyToMany (fetch = FetchType.LAZY)
    @JoinTable (name = "Material_Fornecedor",
                joinColumns = {@JoinColumn ( name = "idFornecedor")},
                inverseJoinColumns = {@JoinColumn ( name = "idMaterial")})
    private List<Material> listaMateriaisFornecidos;
    
    @OneToMany ( mappedBy = "fornecedor",
                fetch = FetchType.LAZY)
    private List<Endereco> endereco;

    public Fornecedor(int idFornecedor, String nome, List<Endereco> endereco) {
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

    public List<Endereco> getEndereco() {
        return this.endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }

    
    
}
