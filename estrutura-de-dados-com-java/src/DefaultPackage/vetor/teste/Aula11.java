package src.DefaultPackage.vetor.teste;

import src.DefaultPackage.vetor.VetorObjetos;

public class Aula11 {

    public static void main(String[] args){

        VetorObjetos vetor = new VetorObjetos(2);

        vetor.adiciona(1);
        vetor.adiciona("Elemento do tipo string");

        System.out.println(vetor);
    }
}
