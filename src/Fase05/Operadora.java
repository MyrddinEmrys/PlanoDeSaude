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
public class Operadora {
    private String nome;
    private PlanoDeSaude planoSaude = new PlanoDeSaude();

    public PlanoDeSaude getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(PlanoDeSaude planoSaude) {
        this.planoSaude = planoSaude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Operadora(PlanoDeSaude planoSaude){
        this.planoSaude = planoSaude;
    }
}
