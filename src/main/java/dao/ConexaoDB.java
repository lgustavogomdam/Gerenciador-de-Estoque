/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gugag
 */
public class ConexaoDB {
    
    private static Connection conexao;
    
    public static Connection obterConexao() throws ClassNotFoundException, SQLException {
        
            String servidor = "127.0.0.1:5432";
            String login = "postgres";
            String senha = "704980";
            String nomeBanco = "StoqDB";
            String url = "jdbc:postgresql://localhost:5432/StoqDB";
            
            // Definição do Driver do banco
            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection( url , login, senha);
            return conexao;        
        
    }
}
