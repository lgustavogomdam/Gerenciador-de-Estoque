/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.ConexaoDB.obterConexao;
import domain.CategoriaMaterial;
import domain.Endereco;
import domain.Fornecedor;
import domain.Material;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gugag
 */
public class MaterialDAO {
    
    public List<Material> listar() throws ClassNotFoundException, SQLException{
        
        //Criação de variáveis
        Material material;
        List<Material> listaMateriais = new ArrayList<Material>();
        
        //Criação do statement para trafegar o SQL
        Statement smt;
        smt = obterConexao().createStatement();
        
        //SQL de Busca e captura de resultado
        String sql = "SELECT * FROM MATERIAL AS MAT"
                + "inner join categoria_material as cat on mat.idcategoriamaterial = cat.idcategoriamaterial"
                + "inner join fornecedor as forn on mat.idfornecedor = forn.idfornecedor"
                + "inner join endereco as ender on forn.idfornecedor = ender.idfornecedor";
        
        ResultSet resultSQL = smt.executeQuery(sql);
        
        //Pega o resultado Sql e constrói um objeto a partir dessas informações, depois o insere na lista
        while(resultSQL.next()){
            
            //captura o campo categoria material como FKey
            CategoriaMaterial catMaterial = new CategoriaMaterial(resultSQL.getInt("cat.idcategoriamaterial"),
                    resultSQL.getString("cat.nomecategoriamaterial"));
            
            //captura o campo endereco da FKey de fornecedor para poder capturar um Fornecedor como FKey
            Endereco endereco = new Endereco(resultSQL.getInt("ender.idendereco"), resultSQL.getString("ender.cep"),
                    resultSQL.getString("ender.bairro"), resultSQL.getString("ender.logradouro"), resultSQL.getInt("ender.numero"),
                    resultSQL.getString("ender.cidade"), resultSQL.getString("ender.estado"));
            
            //captura o campo forncedor como FKey
            Fornecedor fornecedor = new Fornecedor(resultSQL.getInt("forn.idfornecedor"), resultSQL.getString("forn.nomefornecedor"),endereco);
            
            //captura o material com suas FKey's
            material = new Material(resultSQL.getInt("mat.idMaterial"), resultSQL.getString("mat.nomeMaterial"),
                    resultSQL.getDouble("mat.valorMaterial"), fornecedor, catMaterial);
            
            
            //'Capturar' -> instanciar passando os dados do Banco para o construtor 
            
            //adiciona na lista para retornar
            listaMateriais.add(material);
        }
        
        return listaMateriais;
    }
    
    
}
