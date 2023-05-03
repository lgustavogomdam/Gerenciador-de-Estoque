package domain;

import java.io.Serializable;




/**
 *
 * @author 1547816
 */


public class Endereco{
    
    private int idEndereco;
    private String cep;   
    private String bairro;
    private String logradouro;
    private int numero;
    private String cidade;
    private String uf;   

    public Endereco() {
    }

    public Endereco(int idEndereco, String cep, String bairro, String logradouro, int numero, String cidade, String uf) {
        this.idEndereco = idEndereco;
        this.cep = cep;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
