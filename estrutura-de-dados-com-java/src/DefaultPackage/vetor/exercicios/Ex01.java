package src.DefaultPackage.vetor.exercicios;

import src.DefaultPackage.vetor.Lista;

public class Ex01 {

    public static void main(String[] args){
        Lista<String> lista = new Lista<String>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("B"));
        System.out.println(lista.contem("E"));


    }
}
