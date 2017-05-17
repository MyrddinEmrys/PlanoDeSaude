/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fase05;

import java.util.ArrayList;

/**
 *
 * @author Alden Fachetti
 */
public class planoDeSaude {
    private Segurado segurado;
    private Operadora operadora;
    private Procedimento procedimento;
    
    public planoDeSaude(Segurado segurado,Operadora operadora,Procedimento procedimento){
        this.segurado = new Segurado();
        this.operadora = operadora;
        this.procedimento = new Procedimento();
    }
    
    private long numAutorizacao;
    private String nome;
    private ArrayList<planoDeSaude> planoSaude;

    public planoDeSaude() {
        this.segurado = new Segurado();
        this.planoSaude = new ArrayList();
    }
    
    
    public void addplanoSaude(planoDeSaude plano){
        this.planoSaude.add(plano);
    }
    
    public ArrayList<planoDeSaude> getplanoSaude(){
        return planoSaude;
    }
    
    public long getNumAutorizacao() {
        return numAutorizacao;
    }

    public void setNumAutorizacao(long numAutorizacao) {
        this.numAutorizacao = numAutorizacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
    
}
