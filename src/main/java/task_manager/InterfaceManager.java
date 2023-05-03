package task_manager;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import windows.*;

/**
 *
 * @author Luiz Gustavo Gomes Damasceno
 */

public class InterfaceManager {
    
    private tela_principal interfaceMain = null;
    private tela_login interfaceLogin = null; ;
    private tela_cadastrarSenha interfaceCadastrarSenha = null; 
    private tela_cadastroMaterial interfaceCadastroMaterial = null; 
    private tela_cadastroPedido interfaceCadastroPedido = null;
    private tela_cadastroVenda interfaceCadastroVenda = null;
    private tela_cadastroProduto interfaceCadastroProduto = null;
    private tela_cadastroCliente interfaceCadastroCliente = null;
    private tela_buscarMaterial interfaceBuscarMaterial = null;
    private tela_buscarProduto interfaceBuscarProduto = null;
    private tela_buscarCliente interfaceBuscarCliente = null;
    
    DomainManager DomMan;
    
    public InterfaceManager(){
        try {
            DomMan = new DomainManager();
        } catch (ClassNotFoundException | SQLException exex) {
            JOptionPane.showMessageDialog(interfaceMain, "Erro ao carregar banco de Dados");
            System.exit(1);
        }
    }
    
    public void abrirTelaLogin(){
        if(interfaceLogin == null)
            interfaceLogin = new tela_login(interfaceMain,true, this);
        
        interfaceLogin.setVisible(true);
    }
    
    public void abrirTelaCadastrarSenha(){
        if(interfaceCadastrarSenha == null)
            interfaceCadastrarSenha = new tela_cadastrarSenha(interfaceMain,true, this);
        
        interfaceCadastrarSenha.setVisible(true);
    }
    
    public void abrirTelaPrincipal(InterfaceManager interMng){
        
        if(interfaceMain == null)
            interfaceMain = new tela_principal(this);
        
        interfaceMain.setVisible(true);
    }
    
    public void abrirTelaCadastroMaterial(){
        if(interfaceCadastroMaterial == null)
            interfaceCadastroMaterial = new tela_cadastroMaterial(interfaceMain,true, this);
        
        interfaceCadastroMaterial.setVisible(true);
    }
    
    public void abrirTelaCadastroPedido(){
        if(interfaceCadastroPedido == null)
            interfaceCadastroPedido = new tela_cadastroPedido(interfaceMain,true, this);
        
        interfaceCadastroPedido.setVisible(true);
    }
    
    public void abrirTelaCadastroVenda(){
        if(interfaceCadastroVenda == null)
            interfaceCadastroVenda = new tela_cadastroVenda(interfaceMain,true, this);
        
        interfaceCadastroVenda.setVisible(true);
    }
    
    public void abrirTelaCadastroProduto(){
        if(interfaceCadastroProduto == null)
            interfaceCadastroProduto = new tela_cadastroProduto(interfaceMain,true, this);
        
        interfaceCadastroProduto.setVisible(true);
    }
    
    public void abrirTelaCadastroCliente(){
        if(interfaceCadastroCliente == null)
            interfaceCadastroCliente = new tela_cadastroCliente(interfaceMain,true, this);
        
        interfaceCadastroCliente.setVisible(true);
    }
    
    public void abrirTelaBuscarMaterial(){
        if(interfaceBuscarMaterial == null)
            interfaceBuscarMaterial = new tela_buscarMaterial(interfaceMain,true, this);
        
        interfaceBuscarMaterial.setVisible(true);
    }
    
    public void abrirTelaBuscarProduto(){
        if(interfaceBuscarProduto == null)
            interfaceBuscarProduto = new tela_buscarProduto(interfaceMain,true, this);
        
        interfaceBuscarProduto.setVisible(true);
    }
 
    public void abrirTelaBuscarCliente(){
        if(interfaceBuscarCliente == null)
            interfaceBuscarCliente = new tela_buscarCliente(interfaceMain,true, this);
        
        interfaceBuscarCliente.setVisible(true);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Dark Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tela_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        InterfaceManager InterMng = new InterfaceManager();
        InterMng.abrirTelaPrincipal(InterMng);
    }
}
