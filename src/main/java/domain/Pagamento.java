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
public class Pagamento {
    
    public static final int CARTAO = 1;
    public static final int BOLETO = 2;
    public static final int TED = 3;
    
    private int idPagamento;
    private int formaPagamento;
    private int parcelas;
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
    
    
    
}
