package src.DefaultPackage.vetor.teste;

import src.DefaultPackage.vetor.VetorObjetos;

public class Aula10 {

    public static void main(String[] args){

        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("Contato 1","1234-567","contato1@email.com");
        Contato c2 = new Contato("Contato 2","1352-567","contato2@email.com");
        Contato c3 = new Contato("Contato 3","4321-567","contato3@email.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho = "+vetor.tamanho());

        System.out.println(vetor);

        int pos = vetor.busca(c1);
        if (pos >-1){
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("Elemento não existe no vetor");
        }

    }
}
