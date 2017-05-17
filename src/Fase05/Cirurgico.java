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
public class Cirurgico {
    private int qtdeDeMedicos;
    private String tipo;

    public int getQtdeDeMedicos() {
        return qtdeDeMedicos;
    }

    public void setQtdeDeMedicos(int qtdeDeMedicos) {
        this.qtdeDeMedicos = qtdeDeMedicos;
    }

    public void setTipo() {
        this.tipo = "cirurgico";
    }

    public String getTipo() {
        return tipo;
    }
    
}
