/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author gugag
 */
public class Pedido implements Venda{
    
    private int idPedido;
    private Cliente cliente;
    private List<Produto> itensPedido;
    private Date dataPedido;
    private Pagamento pagamento;
    private boolean statusConcluido;
    private double valorFinal;

    public Pedido(Cliente cliente, List<Produto> itensPedido, Date dataPedido, Pagamento pagamento, double valorFinal) {
        this.cliente = cliente;
        this.itensPedido = itensPedido;
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
