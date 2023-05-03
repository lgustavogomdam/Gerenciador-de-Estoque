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
public class CategoriaMaterial {
    
    private int idCategoriaMaterial;
    private String nome;

    public CategoriaMaterial(int idCategoriaMaterial, String nome) {
        this.idCategoriaMaterial = idCategoriaMaterial;
        this.nome = nome;
    }

    

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
