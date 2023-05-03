/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_manager;

import static dao.ConexaoDB.obterConexao;
import java.sql.SQLException;

/**
 *
 * @author gugag
 */
public class DomainManager {
    
    public DomainManager() throws ClassNotFoundException, SQLException{
        obterConexao();
    }
}
