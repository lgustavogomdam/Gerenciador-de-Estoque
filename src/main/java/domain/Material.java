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
public class Material {
    
    private int idMaterial;
    private String nome;
    private double valor;
    private CategoriaMaterial categoria;
    private Fornecedor fornecedor;

    public Material(int idMaterial, String nome, double valor,  Fornecedor fornecedor, CategoriaMaterial categoria) {
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

    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    
    
}
