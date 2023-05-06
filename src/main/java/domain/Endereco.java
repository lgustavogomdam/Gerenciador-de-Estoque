package domain;

import java.io.Serializable;
import javax.persistence.*;




/**
 *
 * @author 1547816
 */

@Entity
public class Endereco implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idEndereco;
    
    @Column ( updatable = true, nullable = false, length = 8)
    private String cep;
    
    @Column ( updatable = true, nullable = false, length = 50)
    private String bairro;
    
    @Column ( updatable = true, nullable = false, length = 50)
    private String logradouro;
    
    @Column ( updatable = true, nullable = false, length = 5)
    private int numero;
    
    @Column ( updatable = true, nullable = false, length = 50)
    private String cidade;
    
    @Column ( updatable = true, nullable = false, length = 30)
    private String uf;   
    
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "idCliente")
    private Cliente cliente;
    
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn ( name = "idFornecedor")
    private Fornecedor fornecedor;

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
