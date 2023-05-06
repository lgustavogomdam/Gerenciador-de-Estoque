/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author gugag
 */

@Entity
public class Pedido implements Venda, Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idPedido;
    
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn ( name = "idCliente")
    private Cliente cliente;
    
    @ManyToMany (fetch = FetchType.EAGER)
    @JoinTable (name = "Pedido_Produto",
                joinColumns = {@JoinColumn ( name = "idPedido")},
                inverseJoinColumns = {@JoinColumn ( name = "idProduto")})
    private List<Produto> itensPedido;
    
    @Temporal ( TemporalType.DATE )
    private Date dataPedido;
    
    @ManyToOne
    @JoinColumn(name = "idPagamento")
    private Pagamento pagamento;
    
    @Column (nullable = false)
    private boolean statusConcluido;
    
    @Column (nullable = false, length = 15)
    private double valorFinal;

    public Pedido(Cliente cliente, List<Produto> itensPedido, Date dataPedido, Pagamento pagamento, double valorFinal) {
        this.cliente = cliente;
        this.itensPedido = new ArrayList();
        this.dataPedido = dataPedido;
        this.pagamento = pagamento;
        this.statusConcluido = false;
        this.valorFinal = valorFinal;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getItensPedido() {
        return this.itensPedido;
    }

    public void setItensPedido(List<Produto> itensPedido) {
        this.itensPedido = itensPedido;
    }

    public Date getDataPedido() {
        return this.dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Pagamento getPagamento() {
        return this.pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public boolean isStatusConcluido() {
        return this.statusConcluido;
    }

    public void setStatusConcluido(boolean statusConcluido) {
        this.statusConcluido = statusConcluido;
    }

    public double getValorFinal() {
        return this.valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    @Override
    public void darBaixaPedido() {
        this.statusConcluido = true;
    }
    
    
    
}
