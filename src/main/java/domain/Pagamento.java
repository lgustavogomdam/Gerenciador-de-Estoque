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
public class Pagamento implements Serializable{
    
    public static final int CARTAO = 1;
    public static final int BOLETO = 2;
    public static final int TED = 3;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idPagamento;
    
    @Column (updatable = true, nullable = false, length = 1)
    private int formaPagamento;
    
    @Column (updatable = true, nullable = false, length = 3)
    private int parcelas;
    
    @Column (updatable = true, nullable = false, length = 5)
    private double juros;

    public Pagamento(int formaPagamento, int parcelas) {
        
        this.formaPagamento = formaPagamento;
        
        if(parcelas <= 0)
            this.parcelas = 1;
        else
            this.parcelas = parcelas;
        
        switch(formaPagamento){
            
            case CARTAO:
                this.juros = 0.45;
            break;
            
            case BOLETO:
                this.juros = 0.15;
            break;
            
            case TED:
                this.juros = 0.25;
            break;
        }
    }

    public int getFormaPagamento() {
        return this.formaPagamento;
    }

    public void setFormaPagamento(int formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public int getParcelas() {
        return this.parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public double getJuros() {
        return this.juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
    
    
    
    
}
