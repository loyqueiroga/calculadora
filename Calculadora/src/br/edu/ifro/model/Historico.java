/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author 03575834261
 */
@Entity
public class Historico {

    @Id
    @GeneratedValue
    private Integer id;
    private Double primeiroValor;
    private Double segundoValor;
    private String operador;
    private Double resultado;
    
   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrimeiroValor() {
        return primeiroValor;
    }

    public void setPrimeiroValor(Double primeiroValor) {
        this.primeiroValor = primeiroValor;
    }

    public Double getSegundoValor() {
        return segundoValor;
    }

    public void setSegundoValor(Double segundoValor) {
        this.segundoValor = segundoValor;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }
    
    
    
    
    
}
