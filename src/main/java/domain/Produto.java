/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.List;

/**
 *
 * @author gugag
 */
public class Produto {
    
    private int idProduto;
    private String nome;
    private CategoriaProduto categoria;
    private List<Material> listaMateriais;
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
