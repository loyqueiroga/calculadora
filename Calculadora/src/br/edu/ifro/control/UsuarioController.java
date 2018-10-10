/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author 04647218228
 */
public class UsuarioController implements Initializable {

    @FXML
    private TextField txtUsuario;
    @FXML
    private TextField txtSenha;
    @FXML
    private TextField txtConfirmar;
    @FXML
    private Button btnCriar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
    public void salvar () throws IOException{
        
        
    } 
}
