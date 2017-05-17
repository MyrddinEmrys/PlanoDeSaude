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
public class ItemDeProcedimentos {
    private Procedimento procedimento;
    private int quantidade;
    private ArrayList<String> listadeprocedimentos;
    
    public ItemDeProcedimentos(Procedimento procedimento){
        this.procedimento = new Procedimento();
    }
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public ArrayList<String> getListadeprocedimentos() {
        return listadeprocedimentos;
    }

    public void addListadeprocedimentos(String ldp) {
        this.listadeprocedimentos.add(ldp);
    }
    
    public ItemDeProcedimentos() {
        this.listadeprocedimentos = new ArrayList();
    }
 
}
