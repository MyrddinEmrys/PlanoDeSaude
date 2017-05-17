/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fase05;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Alden Fachetti
 */
public class Segurado {
    private PlanoDeSaude planoSaude;
    private Autorizacao autorizacao ;
    public Segurado(PlanoDeSaude planoSaude, Autorizacao autorizacao) {
        this.planoSaude  = new PlanoDeSaude();
        this.autorizacao = new Autorizacao();
    } 
    
    private String nome;
    private long cpf;
    private ArrayList<Segurado> Segurado;
    
    
    public String getNome() {
        return nome;
    }

    public ArrayList<Segurado> getSegurado() {
        return Segurado;
    }

    public void addSegurado(Segurado segurado) {
        this.Segurado.add(segurado);
    }
    
    public Segurado(){
        this.Segurado = new ArrayList();
    }    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String toString() {
        return nome;
    }
    //funções
    public static void menuAutoriza(){
        System.out.println("Tipo de Autorização");
        System.out.println("Escolha a opção: ");
        System.out.println("1-) Autorizar");
        System.out.println("2-) Negar");
    }
    
    public static void menuTiposProc(){
        System.out.println("Escolha o Procedimento?");
        System.out.println("1-) Cirurgia (adulto)");
        System.out.println("2-) Ambulatorio (adulto)");
    }
    
    public static void invalida(){
        System.out.println("A opção é inválida!");
        System.out.println("");
    }
    
    public static void menuItemsProc(Procedimento pr){       
        System.out.println("Deseja usar " + pr.getNome() + "?");
        System.out.println("1-) Sim");
        System.out.println("2-) Não");
    }
    
    public static void menuMetodoProc(Procedimento pr){       
        System.out.println("Deseja fazer "+pr.getNome()+"?");
        System.out.println("1-) Sim");
        System.out.println("2-) Não");
    }
    
    public static void menuPlanos(PlanoDeSaude p,Segurado s){
        System.out.println("Lista de planos do "+s.getNome()+":");
        for (int i = 0; i < p.getplanoSaude().size(); i++) {
            System.out.println((i+1)+": "+p.getplanoSaude().get(i));
        }
        System.out.println("Escolha a opção");
    }
    
    public static void mostrarDados(Segurado s, PlanoDeSaude p,Autorizacao a,String pl,String es,
                                    Autorizado e2,String t,ItemDeProcedimentos l2, ItemDeProcedimentos l,
                                    ItemDeProcedimentos l1){
        System.out.println("Nome: " + s.getNome());
        System.out.println("CPF: " + s.getCpf());
        System.out.println("Planos: " + p.getplanoSaude());
        System.out.println("Data de Avaliação: " + a.getDataDaAvaliacao());
        System.out.println("Plano Utilizado: " + pl);
        System.out.println("Estado: " + es);
        
        if (es == e2.getEstado()){
            System.out.println("Tipo escolhido: " + t);
            System.out.println("Lista de instrumentos e métodos utilizados: " + l2.getListadeprocedimentos());
            System.out.println("Quantidade de injeção: " + l.getQuantidade());
            System.out.println("Quantidade de gesso: " + l1.getQuantidade());
            System.out.println("Número de autorização: "  +p.getNumAutorizacao());
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Random rand = new Random();
        Segurado s = new Segurado();
        Segurado s1 = new Segurado();
        Segurado s2 = new Segurado();
        PlanoDeSaude p = new PlanoDeSaude();
        PlanoDeSaude p1 = new PlanoDeSaude();
        PlanoDeSaude p2 = new PlanoDeSaude();
        Autorizacao a = new Autorizacao();
        Autorizacao a1 = new Autorizacao();
        Autorizacao a2 = new Autorizacao();
        Estado e = new Estado();
        Pendente e1 = new Pendente();
        Autorizado e2 = new Autorizado();
        Negado e3 = new Negado();
        Procedimento pr = new Procedimento();
        Procedimento pr1 = new Procedimento();
        Procedimento pr2 = new Procedimento();
        Procedimento pr3 = new Procedimento();
        Ambulatorial am = new Ambulatorial();
        Cirurgico c = new Cirurgico();
        ItemDeProcedimentos l = new ItemDeProcedimentos();
        ItemDeProcedimentos l1 = new ItemDeProcedimentos();
        ItemDeProcedimentos l2 = new ItemDeProcedimentos();
        ItemDeProcedimentos l3 = new ItemDeProcedimentos();
        ItemDeProcedimentos l4 = new ItemDeProcedimentos();
        ItemDeProcedimentos l5 = new ItemDeProcedimentos();
        Scanner entrada = new Scanner(System.in);
        
        boolean saida = false;
        int op,op1,op2,opc,opl,num,num1,num2,opp,otp,opm,qi;
        String es,es1,es2,pl,pl1,pl2,t,t1,t2;
        es= e1.getEstado();
        es1= e1.getEstado();
        es2= e1.getEstado();
        pl="Pendente";
        pl1="Pendente";
        pl2="Pendente";
        t="";t1="";t2="";
        qi=0;
        
        s.setNome("Alden");        
        s.setCpf(234567897);
        s1.setNome("Christopher");
        s1.setCpf(876432213);
        s2.setNome("Alessandra");
        s2.setCpf(721456789);
        s.addSegurado(s);      
        s.addSegurado(s1);
        s.addSegurado(s2);
        s1.addSegurado(s);
        s1.addSegurado(s1);
        s2.addSegurado(s);
        p.setNome("Dix");
        p1.setNome("LinkX");
        p2.setNome("Amil 300");
        p.addplanoSaude(p);
        p.addplanoSaude(p1);
        p.addplanoSaude(p2);
        p1.addplanoSaude(p);
        p1.addplanoSaude(p1);
        p2.addplanoSaude(p);
        a.setDataDaAvaliacao("21/05/2017");
        a1.setDataDaAvaliacao("11/05/2017");
        a2.setDataDaAvaliacao("31/05/2017");
        e1.setEstado();
        a.Autorizar(e2);
        a.Negar(e3);
        pr.setNome("Injeção");
        pr1.setNome("Gesso");
        pr2.setNome("Anestesia");
        pr3.setNome("Corte Cirurgico");
        am.setTipo();
        c.setTipo();       
        l.addListadeprocedimentos(pr.getNome());
        l.addListadeprocedimentos(pr1.getNome()); 
        l1.addListadeprocedimentos(pr2.getNome());
        l1.addListadeprocedimentos(pr3.getNome());
        
        while (saida==false){
            System.out.println("Menu de Autorização das Consultas"); 
            System.out.println("Escolha uma das Opções: ");
            System.out.println("1-) Fazer uma Autorização");
            System.out.println("2-) Conferir os Planos de Saúde");
            System.out.println("3-) Verificar Status dos Clientes");
            System.out.println("4-) Sair do Sistema");
            op = entrada.nextInt();
            System.out.println("");
            switch(op){
                case 1:
                    System.out.println("Lista de Clientes");
                    for (int i = 0; i < s.getSegurado().size(); i++) {
                        System.out.println((i+1)+": "+s.getSegurado().get(i));        
                    }
                    System.out.println("Escolha a opção: ");
                    op1 = entrada.nextInt();
                    System.out.println("");
                    switch(op1){
                        case 1:
                            if (es==e2.getEstado()){
                                System.out.println("Já está autorizado");
                                break;
                            }
                            menuPlanos(p,s);
                            opl = entrada.nextInt();
                            System.out.println("");
                            switch(opl){
                                case 1:
                                    menuAutoriza();
                                    opc = entrada.nextInt();
                                    switch(opc){
                                        case 1:
                                            System.out.println("");
                                            menuTiposProc();
                                            otp=entrada.nextInt();
                                            while ((otp<1)||(otp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                otp=entrada.nextInt();
                                            }
                                            switch(otp){
                                                case 1:
                                                    System.out.println("Tipo cirurgico escolhido");
                                                    t=c.getTipo();
                                                    System.out.println("");
                                                    break;
                                                case 2:
                                                    System.out.println("Tipo ambulatorio escolhido");
                                                    t=am.getTipo();
                                                    System.out.println("");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;   
                                            }
                                            System.out.println("Lista de Instrumentos: "+l.getListadeprocedimentos());
                                            menuItemsProc(pr);
                                            opp=entrada.nextInt();
                                            while ((opp<1)||(opp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opp=entrada.nextInt();
                                            }
                                            switch(opp){
                                                case 1:
                                                    l2.addListadeprocedimentos(pr.getNome());
                                                    System.out.println("Definir a quantidade ");
                                                    qi = entrada.nextInt();
                                                    while (qi<1){
                                                        invalida();
                                                        System.out.println("Quantidade deve ser acima de zero");
                                                        qi = entrada.nextInt();
                                                    }
                                                    l.setQuantidade(qi);
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado: "+pr.getNome());
                                                    break;
                                            }
                                            System.out.println("");
                                            menuItemsProc(pr1);
                                            opp=entrada.nextInt();
                                            while ((opp<1)||(opp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opp=entrada.nextInt();
                                            }
                                            switch(opp){
                                                case 1:
                                                    l2.addListadeprocedimentos(pr1.getNome());
                                                    System.out.println("Adicione a quantidade ");
                                                    qi = entrada.nextInt();
                                                    while (qi<1){
                                                        invalida();
                                                        System.out.println("Quantidade deve ser acima de zero");
                                                        qi = entrada.nextInt();
                                                    }
                                                    l1.setQuantidade(qi);
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado: "+pr1.getNome());
                                                    break;
                                            }
                                            System.out.println("");
                                            System.out.println("Lista de Métodos: "+l1.getListadeprocedimentos());
                                            menuMetodoProc(pr2);
                                            opm=entrada.nextInt();
                                            while ((opm<1)||(opm>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opm=entrada.nextInt();
                                            }
                                            switch(opm){
                                                case 1:
                                                    l2.addListadeprocedimentos(pr2.getNome());
                                                    System.out.println("Adicionado "+pr2.getNome());
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;
                                            }
                                            System.out.println("");
                                            menuMetodoProc(pr3);
                                            opm=entrada.nextInt();
                                            while ((opm<1)||(opm>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opm=entrada.nextInt();
                                            }
                                            switch(opm){
                                                case 1:
                                                    l2.addListadeprocedimentos(pr3.getNome());
                                                    System.out.println("Adicionado "+pr3.getNome());
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;
                                            }
                                            System.out.println("");
                                            System.out.println("Cliente autorizado a fazer consulta");
                                            num= rand.nextInt(100000)+999999;
                                            p.setNumAutorizacao(num);
                                            System.out.println("Seu número de autorização é esse: "+p.getNumAutorizacao());
                                            pl=p.getNome();
                                            es= e2.getEstado();
                                            System.out.println("");
                                            break;
                                        case 2:
                                            System.out.println("Cliente não pode fazer autorização");
                                            pl = "seu plano foi recusado";
                                            es= e3.getEstado();
                                            System.out.println("");
                                            break;
                                        default:
                                            System.out.println("Opção Inválida");
                                            System.out.println("");
                                            break;
                                    }                                                                   
                                    break;
                                case 2:
                                    menuAutoriza();
                                    opc = entrada.nextInt();
                                    System.out.println("");
                                    switch(opc){
                                        case 1:
                                            menuTiposProc();
                                            otp=entrada.nextInt();
                                            while ((otp<1)||(otp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                otp=entrada.nextInt();
                                            }
                                            switch(otp){
                                                case 1:
                                                    System.out.println("Tipo cirurgico escolhido");
                                                    t=c.getTipo();
                                                    System.out.println("");
                                                    break;
                                                case 2:
                                                    System.out.println("Tipo ambulatorio escolhido");
                                                    t=am.getTipo();
                                                    System.out.println("");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;   
                                            }
                                            System.out.println("Lista de Instrumentos: "+l.getListadeprocedimentos());
                                            menuItemsProc(pr);
                                            opp=entrada.nextInt();
                                            while ((opp<1)||(opp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opp=entrada.nextInt();
                                            }
                                            switch(opp){
                                                case 1:
                                                    l2.addListadeprocedimentos(pr.getNome());
                                                    System.out.println("Definir a quantidade ");
                                                    qi = entrada.nextInt();
                                                    while (qi<1){
                                                        invalida();
                                                        System.out.println("Quantidade deve ser acima de zero");
                                                        qi = entrada.nextInt();
                                                    }
                                                    l.setQuantidade(qi);
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado: "+pr.getNome());
                                                    break;
                                            }
                                            System.out.println("");
                                            menuItemsProc(pr1);
                                            opp=entrada.nextInt();
                                            while ((opp<1)||(opp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opp=entrada.nextInt();
                                            }
                                            switch(opp){
                                                case 1:
                                                    l2.addListadeprocedimentos(pr1.getNome());
                                                    System.out.println("Definir a quantidade ");
                                                    qi = entrada.nextInt();
                                                    while (qi<1){
                                                        invalida();
                                                        System.out.println("Quantidade deve ser acima de zero");
                                                        qi = entrada.nextInt();
                                                    }
                                                    l1.setQuantidade(qi);
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado: "+pr1.getNome());
                                                    break;
                                            }
                                            System.out.println("");
                                            System.out.println("Lista de Métodos: "+l1.getListadeprocedimentos());
                                            menuMetodoProc(pr2);
                                            opm=entrada.nextInt();
                                            while ((opm<1)||(opm>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opm=entrada.nextInt();
                                            }
                                            switch(opm){
                                                case 1:
                                                    l2.addListadeprocedimentos(pr2.getNome());
                                                    System.out.println("Adicionado "+pr2.getNome());
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;
                                            }
                                            System.out.println("");
                                            menuMetodoProc(pr3);
                                            opm=entrada.nextInt();
                                            while ((opm<1)||(opm>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opm=entrada.nextInt();
                                            }
                                            switch(opm){
                                                case 1:
                                                    l2.addListadeprocedimentos(pr3.getNome());
                                                    System.out.println("Adicionado "+pr3.getNome());
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;
                                            }
                                            System.out.println("");
                                            System.out.println("Cliente autorizado a fazer consulta");
                                            num= rand.nextInt(100000)+999999;
                                            p.setNumAutorizacao(num);
                                            System.out.println("Seu número de autorização é esse: "+p.getNumAutorizacao());
                                            pl=p1.getNome();
                                            es= e2.getEstado();
                                            System.out.println("");
                                            break;
                                        case 2:
                                            System.out.println("Cliente não pode fazer autorização");
                                            pl = "plano recusado";
                                            es= e3.getEstado();
                                            System.out.println("");
                                            break;
                                        default:
                                            System.out.println("Opção Inválida");
                                            System.out.println("");
                                            break;
                                    }   
                                    break;
                                case 3:
                                    menuAutoriza();
                                    opc = entrada.nextInt();
                                    switch(opc){
                                        case 1:
                                            System.out.println("");
                                            menuTiposProc();
                                            otp=entrada.nextInt();
                                            while ((otp<1)||(otp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                otp=entrada.nextInt();
                                            }
                                            switch(otp){
                                                case 1:
                                                    System.out.println("Tipo cirurgico escolhido");
                                                    t=c.getTipo();
                                                    System.out.println("");
                                                    break;
                                                case 2:
                                                    System.out.println("Tipo ambulatorio escolhido");
                                                    t=am.getTipo();
                                                    System.out.println("");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;   
                                            }
                                            System.out.println("Lista de Instrumentos: "+l.getListadeprocedimentos());
                                            menuItemsProc(pr);
                                            opp=entrada.nextInt();
                                            while ((opp<1)||(opp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opp=entrada.nextInt();
                                            }
 
                                            switch(opp){
                                                case 1:
                                                    l2.addListadeprocedimentos(pr.getNome());
                                                    System.out.println("Definir a quantidade ");
                                                    qi = entrada.nextInt();
                                                    while (qi<1){
                                                        invalida();
                                                        System.out.println("Quantidade deve ser acima de zero");
                                                        qi = entrada.nextInt();
                                                    }
                                                    l.setQuantidade(qi);
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado: "+pr.getNome());
                                                    break;
                                            }
                                            System.out.println("");
                                            menuItemsProc(pr1);
                                            opp=entrada.nextInt();
                                            while ((opp<1)||(opp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opp=entrada.nextInt();
                                            }
                                            switch(opp){
                                                case 1:
                                                    l2.addListadeprocedimentos(pr1.getNome());
                                                    System.out.println("Definir a quantidade ");
                                                    qi = entrada.nextInt();
                                                    while (qi<1){
                                                        invalida();
                                                        System.out.println("Quantidade deve ser acima de zero");
                                                        qi = entrada.nextInt();
                                                    }
                                                    l1.setQuantidade(qi);
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado: "+pr1.getNome());
                                                    break;
                                            }
                                            System.out.println("");
                                            System.out.println("Lista de Métodos: "+l1.getListadeprocedimentos());
                                            menuMetodoProc(pr2);
                                            opm=entrada.nextInt();
                                            while ((opm<1)||(opm>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opm=entrada.nextInt();
                                            }
                                            switch(opm){
                                                case 1:
                                                    l2.addListadeprocedimentos(pr2.getNome());
                                                    System.out.println("Adicionado "+pr2.getNome());
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;
                                            }
                                            System.out.println("");
                                            menuMetodoProc(pr3);
                                            opm=entrada.nextInt();
                                            while ((opm<1)||(opm>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opm=entrada.nextInt();
                                            }
                                            switch(opm){
                                                case 1:
                                                    l2.addListadeprocedimentos(pr3.getNome());
                                                    System.out.println("Adicionado "+pr3.getNome());
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;
                                            }
                                            System.out.println("Cliente autorizado a fazer consulta");
                                            num= rand.nextInt(100000)+999999;
                                            p.setNumAutorizacao(num);
                                            System.out.println("Seu número de autorização é esse: "+p.getNumAutorizacao());
                                            pl =p2.getNome();
                                            es= e2.getEstado();
                                            System.out.println("");
                                            break;
                                        case 2:
                                            System.out.println("Cliente não pode fazer autorização");
                                            pl= "plano recusado";
                                            es= e3.getEstado();
                                            System.out.println("");
                                            break;
                                        default:
                                            System.out.println("Opção é Inválida!");
                                            System.out.println("");
                                            break;
                                    }
                                break;
                                default:
                                    invalida();
                                    break;
                            }                           
                            break;
                        case 2:
                            if (es1==e2.getEstado()){
                                System.out.println("Já está autorizado");
                                break;
                            }
                            menuPlanos(p1,s1);
                            opl = entrada.nextInt();
                            System.out.println("");
                            switch(opl){
                                case 1:
                                    menuAutoriza();
                                    opc = entrada.nextInt();
                                    switch(opc){
                                        case 1:
                                            System.out.println("");
                                            menuTiposProc();
                                            otp=entrada.nextInt();
                                            while ((otp<1)||(otp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                otp=entrada.nextInt();
                                            }
                                            switch(otp){
                                                case 1:
                                                    System.out.println("Tipo cirurgico escolhido");
                                                    t1=c.getTipo();
                                                    System.out.println("");
                                                    break;
                                                case 2:
                                                    System.out.println("Tipo ambulatorio escolhido");
                                                    t1=am.getTipo();
                                                    System.out.println("");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;   
                                            }
                                            System.out.println("Lista de Instrumentos: "+l.getListadeprocedimentos());
                                            menuItemsProc(pr);
                                            opp=entrada.nextInt();
                                            while ((opp<1)||(opp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opp=entrada.nextInt();
                                            }

                                            switch(opp){
                                                case 1:
                                                    l3.addListadeprocedimentos(pr.getNome());
                                                    System.out.println("Definir a quantidade ");
                                                    qi = entrada.nextInt();
                                                    while (qi<1){
                                                        invalida();
                                                        System.out.println("Quantidade deve ser acima de zero");
                                                        qi = entrada.nextInt();
                                                    }
                                                    l2.setQuantidade(qi);
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado: "+pr.getNome());
                                                    break;
                                            }
                                            System.out.println("");
                                            menuItemsProc(pr1);
                                            opp=entrada.nextInt();
                                            while ((opp<1)||(opp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opp=entrada.nextInt();
                                            }
                                            switch(opp){
                                                case 1:
                                                    l3.addListadeprocedimentos(pr1.getNome());
                                                    System.out.println("Definir a quantidade ");
                                                    qi = entrada.nextInt();
                                                    while (qi<1){
                                                        invalida();
                                                        System.out.println("Quantidade deve ser acima de zero");
                                                        qi = entrada.nextInt();
                                                    }
                                                    l3.setQuantidade(qi);
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado: "+pr1.getNome());
                                                    break;
                                            }
                                            System.out.println("");
                                            System.out.println("Lista de Métodos: "+l1.getListadeprocedimentos());
                                            menuMetodoProc(pr2);
                                            opm=entrada.nextInt();
                                            while ((opm<1)||(opm>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opm=entrada.nextInt();
                                            }
                                            switch(opm){
                                                case 1:
                                                    l3.addListadeprocedimentos(pr2.getNome());
                                                    System.out.println("Adicionado "+pr2.getNome());
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;
                                            }
                                            System.out.println("");
                                            menuMetodoProc(pr3);
                                            opm=entrada.nextInt();
                                            while ((opm<1)||(opm>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opm=entrada.nextInt();
                                            }
                                            switch(opm){
                                                case 1:
                                                    l3.addListadeprocedimentos(pr3.getNome());
                                                    System.out.println("Adicionado "+pr3.getNome());
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;
                                            }
                                            System.out.println("");
                                            System.out.println("Cliente autorizado a fazer consulta");
                                            num= rand.nextInt(100000)+999999;
                                            p1.setNumAutorizacao(num);
                                            System.out.println("Seu número de autorização é esse: "+p1.getNumAutorizacao());
                                            pl1=p.getNome();
                                            es1= e2.getEstado();
                                            System.out.println("");
                                            break;
                                        case 2:
                                            System.out.println("Cliente não pode fazer autorização");
                                            es1= e3.getEstado();
                                            pl1 = "plano recusado";
                                            System.out.println("");
                                            break;
                                        default:
                                            invalida();
                                            break;
                                    }                                                                   
                                    break;
                                case 2:
                                    menuAutoriza();
                                    opc = entrada.nextInt();
                                    switch(opc){
                                        case 1:
                                            System.out.println("");
                                            menuTiposProc();
                                            otp=entrada.nextInt();
                                            while ((otp<1)||(otp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                otp=entrada.nextInt();
                                            }
                                            switch(otp){
                                                case 1:
                                                    System.out.println("Tipo cirurgico escolhido");
                                                    t1=c.getTipo();
                                                    System.out.println("");
                                                    break;
                                                case 2:
                                                    System.out.println("Tipo ambulatorio escolhido");
                                                    t1=am.getTipo();
                                                    System.out.println("");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;   
                                            }
                                            System.out.println("Lista de Instrumentos: "+l.getListadeprocedimentos());
                                            menuItemsProc(pr);
                                            opp=entrada.nextInt();
                                            while ((opp<1)||(opp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opp=entrada.nextInt();
                                            }
                                            switch(opp){
                                                case 1:
                                                    l3.addListadeprocedimentos(pr.getNome());
                                                    System.out.println("Definir a quantidade ");
                                                    qi = entrada.nextInt();
                                                    while (qi<1){
                                                        invalida();
                                                        System.out.println("Quantidade deve ser acima de zero");
                                                        qi = entrada.nextInt();
                                                    }
                                                    l2.setQuantidade(qi);
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado: "+pr.getNome());
                                                    break;
                                            }
                                            System.out.println("");
                                            menuItemsProc(pr1);
                                            opp=entrada.nextInt();
                                            while ((opp<1)||(opp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opp=entrada.nextInt();
                                            }
                                            switch(opp){
                                                case 1:
                                                    l3.addListadeprocedimentos(pr1.getNome());
                                                    System.out.println("Definir a quantidade ");
                                                    qi = entrada.nextInt();
                                                    while (qi<1){
                                                        invalida();
                                                        System.out.println("Quantidade deve ser acima de zero");
                                                        qi = entrada.nextInt();
                                                    }
                                                    l3.setQuantidade(qi);
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado: "+pr1.getNome());
                                                    break;
                                            }
                                            System.out.println("");
                                            System.out.println("Lista de Métodos: "+l1.getListadeprocedimentos());
                                            menuMetodoProc(pr2);
                                            opm=entrada.nextInt();
                                            while ((opm<1)||(opm>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opm=entrada.nextInt();
                                            }
                                            switch(opm){
                                                case 1:
                                                    l3.addListadeprocedimentos(pr2.getNome());
                                                    System.out.println("Adicionado "+pr2.getNome());
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;
                                            }
                                            System.out.println("");
                                            menuMetodoProc(pr3);
                                            opm=entrada.nextInt();
                                            while ((opm<1)||(opm>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opm=entrada.nextInt();
                                            }
                                            switch(opm){
                                                case 1:
                                                    l3.addListadeprocedimentos(pr3.getNome());
                                                    System.out.println("Adicionado "+pr3.getNome());
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;
                                            }
                                            System.out.println("");
                                            System.out.println("Cliente autorizado a fazer consulta");
                                            num= rand.nextInt(100000)+999999;
                                            p1.setNumAutorizacao(num);
                                            System.out.println("Seu número de autorização é esse: "+p1.getNumAutorizacao());
                                            pl1=p1.getNome();
                                            es1= e2.getEstado();
                                            System.out.println("");
                                            break;
                                        case 2:
                                            System.out.println("Cliente não pode fazer autorização");
                                            pl1 = "plano recusado";
                                            es1= e3.getEstado();
                                            System.out.println("");
                                        default:
                                            invalida();
                                            break;
                                    }   
                                    break;
                                    default:
                                        invalida();
                                        break;
                            }
                            break;
                        case 3:
                            if (es==e2.getEstado()){
                                System.out.println("Já está autorizado");
                                break;
                            }
                            menuPlanos(p2,s2);                            
                            opl = entrada.nextInt();
                            System.out.println("");
                            switch(opl){
                                case 1: 
                                    menuAutoriza();
                                    opc = entrada.nextInt();
                                    switch(opc){
                                        case 1:
                                            System.out.println("");
                                            menuTiposProc();
                                            otp=entrada.nextInt();
                                            while ((otp<1)||(otp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                otp=entrada.nextInt();
                                            }
                                            switch(otp){
                                                case 1:
                                                    System.out.println("Tipo cirurgico escolhido");
                                                    t2=c.getTipo();
                                                    System.out.println("");
                                                    break;
                                                case 2:
                                                    System.out.println("Tipo ambulatorio escolhido");
                                                    t2=am.getTipo();
                                                    System.out.println("");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;   
                                            }
                                            System.out.println("Lista de Instrumentos: "+l.getListadeprocedimentos());
                                            menuItemsProc(pr);
                                            opp=entrada.nextInt();
                                            while ((opp<1)||(opp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opp=entrada.nextInt();
                                            }
                                            switch(opp){
                                                case 1:
                                                    l4.addListadeprocedimentos(pr.getNome());
                                                    System.out.println("Definir a quantidade ");
                                                    qi = entrada.nextInt();
                                                    while (qi<1){
                                                        invalida();
                                                        System.out.println("Quantidade deve ser acima de zero");
                                                        qi = entrada.nextInt();
                                                    }
                                                    l4.setQuantidade(qi);
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado: "+pr.getNome());
                                                    break;
                                            }
                                            System.out.println("");
                                            menuItemsProc(pr1);
                                            opp=entrada.nextInt();
                                            while ((opp<1)||(opp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opp=entrada.nextInt();
                                            }
                                            switch(opp){
                                                case 1:
                                                    l4.addListadeprocedimentos(pr1.getNome());
                                                    System.out.println("Definir a quantidade ");
                                                    qi = entrada.nextInt();
                                                    while (qi<1){
                                                        invalida();
                                                        System.out.println("Quantidade deve ser acima de zero");
                                                        qi = entrada.nextInt();
                                                    }
                                                    l5.setQuantidade(qi);
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado: "+pr1.getNome());
                                                    break;
                                            }
                                            System.out.println("");
                                            System.out.println("Lista de Métodos: "+l1.getListadeprocedimentos());
                                            menuMetodoProc(pr2);
                                            opm=entrada.nextInt();
                                            while ((opm<1)||(opm>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opm=entrada.nextInt();
                                            }
                                            switch(opm){
                                                case 1:
                                                    l4.addListadeprocedimentos(pr2.getNome());
                                                    System.out.println("Adicionado "+pr2.getNome());
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;
                                            }
                                            System.out.println("");
                                            menuMetodoProc(pr3);
                                            opm=entrada.nextInt();
                                            while ((opm<1)||(opm>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opm=entrada.nextInt();
                                            }
                                            switch(opm){
                                                case 1:
                                                    l4.addListadeprocedimentos(pr3.getNome());
                                                    System.out.println("Adicionado "+pr3.getNome());
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;
                                            }
                                            System.out.println("Cliente autorizado a fazer consulta");
                                            num= rand.nextInt(100000)+999999;
                                            p2.setNumAutorizacao(num);
                                            System.out.println("Seu número de autorização é esse: "+p2.getNumAutorizacao());
                                            pl2=p.getNome();
                                            es2= e2.getEstado();
                                            System.out.println("");
                                            break;
                                        case 2:
                                            System.out.println("Cliente não pode fazer autorização");
                                            pl2 = "plano recusado";
                                            es2= e3.getEstado();
                                            System.out.println("");
                                        default:
                                            invalida();
                                            break;
                                    }
                                    break;
                                default:
                                    invalida();
                                    break;
                            }
                        break;
                        default:
                            invalida();
                            break;
                        }
                    break;
                case 2:
                    System.out.println("Planos Existentes");
                    for (int i = 0; i < p.getplanoSaude().size(); i++) {
                        System.out.println((i+1)+": "+p.getplanoSaude().get(i));
                    }
                    System.out.println("Escolha a opção: ");
                    op2 = entrada.nextInt();
                    switch(op2){
                        case 1:
                            System.out.println("Pessoas que possuem o plano Dix: "+s.getSegurado());
                            System.out.println("");
                            break;
                        case 2:
                            System.out.println("Pessoas que possuem o plano LinkX: "+s1.getSegurado());
                            System.out.println("");
                            break;                        
                        case 3:
                            System.out.println("Pessoas que possuem o plano Amil 300: "+s2.getSegurado());
                            System.out.println("");
                            break;
                        default:
                            invalida();
                            break;
                        }
                    break;
                case 3:
                    System.out.println("Dados dos Clientes: ");
                    mostrarDados(s,p,a,pl,es,e2,t,l2,l,l1);
                    mostrarDados(s1,p1,a1,pl1,es1,e2,t1,l3,l2,l3);
                    mostrarDados(s2,p2,a2,pl2,es2,e2,t2,l4,l4,l5);
                    break;
                case 4:
                    System.out.println("Programa foi Finalizado!");
                    saida=true;
                    break;
                default:
                    invalida();
                    break;
            }
         
        }
    }
    }  

