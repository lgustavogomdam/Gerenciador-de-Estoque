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
public class Produto implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idProduto;
    
    @Column (updatable = false, nullable = false, length = 50)
    private String nome;
    
    @ManyToOne
    @JoinColumn(name = "idCategoria")
    private CategoriaProduto categoria;
    
    @ManyToMany (fetch = FetchType.EAGER)
    @JoinTable (name = "Produto_Material",
                joinColumns = {@JoinColumn ( name = "idProduto")},
                inverseJoinColumns = {@JoinColumn ( name = "idMaterial")})
    private List<Material> listaMateriais;
    
    @ManyToMany (fetch = FetchType.LAZY)
    @JoinTable (name = "Pedido_Produto",
                joinColumns = {@JoinColumn ( name = "idProduto")},
                inverseJoinColumns = {@JoinColumn ( name = "idPedido")})
    private List<Pedido> listaPedidos;
    
    @Column (nullable = false, length = 15)
    private double valor;

    public Produto(String nome, CategoriaProduto categoria, List<Material> materiais, double valor) {
        this.nome = nome;
        this.categoria = categoria;
        this.listaMateriais = materiais;
        this.valor = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CategoriaProduto getCategoria() {
        return this.categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }

    public List<Material> getListaMateriais() {
        return this.listaMateriais;
    }

    public void setListaMateriais(List<Material> listaMateriais) {
        this.listaMateriais = listaMateriais;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
