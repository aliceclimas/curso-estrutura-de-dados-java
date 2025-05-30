package src.DefaultPackage.vetor.teste;

import src.DefaultPackage.vetor.Vetor;

public class Aula09 {

    static public void main(String[] args){

        Vetor vetor = new Vetor(3);

        vetor.adiciona("B");
        vetor.adiciona("G");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");

        System.out.println(vetor);

        vetor.remove(1);

        System.out.println(vetor);

        int pos = vetor.busca("E");
        if (pos > -1) {
            vetor.remove(pos);
        } else {
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(vetor);


    }
}
