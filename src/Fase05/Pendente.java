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
public class Pendente extends Estado {
   @Override
   public void setEstado(){
       this.estado = tiposEstado.PENDENTE.getTipoEstado();   
   }
}
