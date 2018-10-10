/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.edu.ifro.model.Login;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;


/**
 * FXML Controller class
 *
 * @author 03575834261
 */
public class LoginController implements Initializable {

    @FXML
    private TextField txtUsuario;
    @FXML
    private TextField txtSenha;
    @FXML
    private Button btnNovo;
    @FXML
    private TextField txtSenha2;
    @FXML
    private Button btnLogin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void salvar () throws IOException{
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT l FROM Login as l WHERE l.usuario = :usuario");        
       
        query.setParameter("usuario", txtUsuario.getText());
      
        List<Login> l = query.getResultList();
        if (!l.isEmpty()) {
            //System.out.println(l[0]);
            Login login = l.get(0);
            String senha = txtSenha2.getText();
            String senha2 = txtSenha.getText();
            if (login.getSenha().equals(senha) || login.getSenha().equals(senha2)) {
                JOptionPane.showMessageDialog(null, "Login efetuado com sucesso");
                
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/calculadora.fxml"));
                Scene scene = new Scene(fxmlLoader.load(),600,400);
                Stage stage = new Stage();
                stage.setTitle("Menu Principal");
                stage.setScene(scene);
                stage.show();
                
            }
            else {
                JOptionPane.showMessageDialog(null, "Senha incorreta");
            }
        } 
        else {
            JOptionPane.showMessageDialog(null, "Usuário incorreto");
        }
        
        em.close();
        emf.close();
        
        Stage stage = (Stage) btnLogin.getScene().getWindow();
        stage.close();
    }


@FXML
public void abrirLogin() throws IOException{
    FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Usuario.fxml"));
            Scene scene = new Scene(fxmlLoader.load(),500,500);
            
            Stage stage = new Stage();
            stage.setTitle("Cadastro de Login");
            stage.setScene(scene);
            stage.show();
}
}