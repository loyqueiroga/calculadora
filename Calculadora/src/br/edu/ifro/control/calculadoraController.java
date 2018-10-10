/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.edu.ifro.model.Historico;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author 03575834261
 */
public class calculadoraController implements Initializable {

    @FXML
    private Button btnSoma;
    @FXML
    private Label label;
    @FXML
    private TextField txtNum1;
    @FXML
    private TextField txtNum2;
    @FXML
    private Button btnSub;
    @FXML
    private Button btnMulti;
    @FXML
    private Button btnDiv;
    @FXML
    private TextField txtResultado;
    @FXML
    private Button btnLimpar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void soma(ActionEvent event) {
       Double num1, num2,resultado;
        
       num1 = Double.parseDouble(txtNum1.getText());
       num2 = Double.parseDouble(txtNum2.getText());
       
       resultado = num1 + num2;
       
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
        EntityManager em = emf.createEntityManager();
        
        Historico hist1 = new Historico();
        hist1.setPrimeiroValor(num1);
        hist1.setSegundoValor(num2);
        hist1.setOperador("+");
        hist1.setResultado(resultado);
       
       
    }

    @FXML
    private void subtracao(ActionEvent event) {
       Double num1, num2,resultado;
        
       num1 = Double.parseDouble(txtNum1.getText());
       num2 = Double.parseDouble(txtNum2.getText());
       
       resultado = num1 - num2;
       
       txtResultado.setText(resultado.toString());
       
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
        EntityManager em = emf.createEntityManager();
        
        Historico hist1 = new Historico();
        hist1.setPrimeiroValor(num1);
        hist1.setSegundoValor(num2);
        hist1.setOperador("-");
        hist1.setResultado(resultado);
    }

    @FXML
    private void multiplicacao(ActionEvent event) {
       Double num1, num2,resultado;
        
       num1 = Double.parseDouble(txtNum1.getText());
       num2 = Double.parseDouble(txtNum2.getText());
       
       resultado = num1 * num2;
       
       txtResultado.setText(resultado.toString());
        
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
        EntityManager em = emf.createEntityManager();
        
        Historico hist1 = new Historico();
        hist1.setPrimeiroValor(num1);
        hist1.setSegundoValor(num2);
        hist1.setOperador("*");
        hist1.setResultado(resultado);
    }

    @FXML
    private void divisao(ActionEvent event) {
       Double num1, num2,resultado;
        
       num1 = Double.parseDouble(txtNum1.getText());
       num2 = Double.parseDouble(txtNum2.getText());
       
       resultado = num1 / num2;
       
        txtResultado.setText(resultado.toString());
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
        EntityManager em = emf.createEntityManager();
        
        Historico hist1 = new Historico();
        hist1.setPrimeiroValor(num1);
        hist1.setSegundoValor(num2);
        hist1.setOperador("/");
        hist1.setResultado(resultado);
    }
    
    
    @FXML
    private void limpar(){
       txtNum1.setText("");
       txtNum2.setText("");
       txtResultado.setText("");
    }
            
}
