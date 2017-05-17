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
public class PlanoDeSaude {
    private Segurado segurado;
    private Operadora operadora;
    private Procedimento procedimento;
    
    public PlanoDeSaude(Segurado segurado,Operadora operadora,Procedimento procedimento){
        this.segurado = new Segurado();
        this.operadora = operadora;
        this.procedimento = new Procedimento();
    }
    
    private long numAutorizacao;
    private String nome;
    private ArrayList<PlanoDeSaude> planoSaude;

    public PlanoDeSaude() {
        this.segurado = new Segurado();
        this.planoSaude = new ArrayList();
    }
    
    
    public void addplanoSaude(PlanoDeSaude plano){
        this.planoSaude.add(plano);
    }
    
    public ArrayList<PlanoDeSaude> getplanoSaude(){
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
