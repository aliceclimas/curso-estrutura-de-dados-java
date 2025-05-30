package src.DefaultPackage.vetor.teste;

import src.DefaultPackage.vetor.Vetor;

public class Aula06 {

    public static void main(String[] args){

        Vetor vetor = new Vetor(10);

        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 1");

        System.out.println(vetor.busca("Elemento 1"));
        System.out.println(vetor.busca("ELemento 1"));


    }
}
