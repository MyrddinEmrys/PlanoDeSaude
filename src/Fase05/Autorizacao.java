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
public class Autorizacao {
    private Local local;
    private Estado estado;
    private Segurado segurado;
    private ItemDeProcedimentos listadeprocedimentos;
    private String dataDaAvaliacao;
    
    public Autorizacao(Local local,Estado estado,Segurado segurado,ItemDeProcedimentos listadeprocedimentos) {
        this.local = local;
        this.estado = estado;
        this.segurado = segurado;
        listadeprocedimentos = new ItemDeProcedimentos();
    }
    
    public Autorizacao(){
    }

    public String getDataDaAvaliacao() {
        return dataDaAvaliacao;
    }

    public void setDataDaAvaliacao(String dataDaAvaliacao) {
        this.dataDaAvaliacao = dataDaAvaliacao;
    }
     
    public void Autorizar(Autorizado e){
        e.setEstado();
    }
    public void Negar(Negado e){
        e.setEstado();
    }
  
}
