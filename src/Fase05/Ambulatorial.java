/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fase05;

/**
 *
 * @author Alden Fachetti
 */
public class Ambulatorial {
    private int qtdeDeTecnicos;
    private String tipo;


    public int getQtdeDeTecnicos() {
        return qtdeDeTecnicos;
    }

    public void setQtdeDeTecnicos(int qtdeDeTecnicos) {
        this.qtdeDeTecnicos = qtdeDeTecnicos;
    }

    public void setTipo() {
        this.tipo = "Ambulatorial";
    }

    public String getTipo() {
        return tipo;
    }
    
}
