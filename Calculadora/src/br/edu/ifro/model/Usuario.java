/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.model;

/**
 *
 * @author 04647218228
 */
public class Usuario {
  
    private String txtUsuario;
    private String txtSenha;
    private String txtConfirmar;
    
    public String getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(String txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

    public String getTxtSenha() {
        return txtSenha;
    }

    public void setTxtSenha(String txtSenha) {
        this.txtSenha = txtSenha;
    }

    public String getTxtConfirmar() {
        return txtConfirmar;
    }

    public void setTxtConfirmar(String txtConfirmar) {
        this.txtConfirmar = txtConfirmar;
    }
   
}
