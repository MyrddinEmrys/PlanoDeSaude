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


/**classe de criador abstrata que é a Creator, Define um método
GeneroSegurado abstrato, suas subclasses implementam para criar um
genero e pode possuir um ou mais métodos com
seus devidos comportamentos
*/
public abstract class GeneroSegurado {
    public String nome;
    public String sexo;
}

class Homem extends GeneroSegurado {
    public Homem(String nome) {
        this.nome = nome;
        System.out.println("Olá Senhor " + this.nome);
    }
}

class Mulher extends GeneroSegurado {
    public Mulher(String nome) {
        this.nome = nome;
        System.out.println("Olá Senhora " + this.nome);
    }
}
