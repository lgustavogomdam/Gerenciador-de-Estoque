/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author gugag
 */

@Entity
public class CategoriaMaterial implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idCategoriaMaterial;
    
    @Column (updatable = false, nullable = false, length = 50)
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
