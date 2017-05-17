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
public class Procedimento {
    private planoDeSaude planoSaude ;
    private ItemDeProcedimentos ListaDeProcedimentos;
    public Procedimento(planoDeSaude planoSaude, ItemDeProcedimentos ListaDeProcedimentos){
        this.planoSaude = new planoDeSaude();
        this.ListaDeProcedimentos = new ItemDeProcedimentos();
    }
    private String nome;
    private String tipo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo() {
        this.tipo = "pendente";
    }
    
    
    public Procedimento() {
        
    }
    
}
