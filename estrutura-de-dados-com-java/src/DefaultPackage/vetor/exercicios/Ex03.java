package src.DefaultPackage.vetor.exercicios;

import src.DefaultPackage.vetor.Lista;

public class Ex03 {

    public static void main(String[] args){
        Lista<String> lista = new Lista<String>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");

        System.out.println(lista);

        lista.remove("A");

        System.out.println(lista);

        lista.remove("E");

        System.out.println(lista);



    }
}
