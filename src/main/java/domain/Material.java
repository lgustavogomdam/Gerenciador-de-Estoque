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
public class Material implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idMaterial;
    
    @Column (updatable = false, nullable = false, length = 50)
    private String nome;
    
    @Column (updatable = true, nullable = false, length = 10)
    private double valor;
    
    @ManyToOne
    @JoinColumn(name = "idCategoria")
    private CategoriaMaterial categoria;
    
    @ManyToMany (fetch = FetchType.LAZY)
    @JoinTable (name = "Produto_Material",
                joinColumns = {@JoinColumn ( name = "idMaterial")},
                inverseJoinColumns = {@JoinColumn ( name = "idProduto")})
    private List<Produto> listaProdutos;
    
    @ManyToMany (fetch = FetchType.EAGER)
    @JoinTable (name = "Material_Fornecedor",
                joinColumns = {@JoinColumn ( name = "idMaterial")},
                inverseJoinColumns = {@JoinColumn ( name = "idFornecedor")})
    private List<Fornecedor> fornecedor;

    public Material(int idMaterial, String nome, double valor,  List<Fornecedor> fornecedor, CategoriaMaterial categoria) {
        this.idMaterial = idMaterial;
        this.nome = nome;
        this.valor = valor;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
    }

    public int getIdMaterial() {
        return this.idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public CategoriaMaterial getCategoria() {
        return this.categoria;
    }

    public void setCategoria(CategoriaMaterial categoria) {
        this.categoria = categoria;
    }

    public List<Fornecedor> getFornecedor() {
        return this.fornecedor;
    }

    public void setFornecedor(List<Fornecedor> fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    
    
}
