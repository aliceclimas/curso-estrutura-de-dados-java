package src.DefaultPackage.pilha.teste;

import src.DefaultPackage.pilha.Pilha;

public class Aula16 {

    public static void main(String[] args){

        Pilha<Integer> pilha = new Pilha<Integer>();
        System.out.println(pilha.topo());

        System.out.println(pilha);

        pilha.empilha(1);
        pilha.empilha(2);

        System.out.println(pilha.topo());

        System.out.println(pilha);

    }
}
