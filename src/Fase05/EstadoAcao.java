/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fase05;

/**
 *
 * @author alden.fachetti
 */
public class EstadoAcao extends Estado{    
    //este método vem do estado
    //ela retorna uma string informando o próximo passo
    //a ser tomado pelo controlador
    public String facaAcao(Formulario f) {
        //Aqui você acessa seu modelo
        Modelo m = Modelo.getInstance();
        m.cadastra(f);
        return "sucessoCadastro";
    }

    private static class Modelo {

        private static Modelo getInstance() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Modelo() {
        }

        private void cadastra(Formulario f) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class Formulario {

        public Formulario() {
        }
    }
}
