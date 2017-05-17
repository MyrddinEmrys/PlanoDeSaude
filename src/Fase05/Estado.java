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
public class Estado {
    private Autorizacao autorizacao ;
    
    public Estado(Autorizacao autorizacao){
        this.autorizacao = new Autorizacao();
    }
    
    protected String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado() {
        this.estado = estado;
    }

    public Estado() {
        
    }
    
    public enum tiposEstado{
        AUTORIZADO("Autorizado"),NEGADO("Negado"),PENDENTE("Pendente");
        private final String opcao;
        tiposEstado(String valoropcao){
            opcao = valoropcao;
        }  

        public String getTipoEstado() {
            return opcao;
        }
        
    }
}
