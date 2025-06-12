package src.DefaultPackage.lista.exercicios;

import src.DefaultPackage.lista.ListaEncadeada;

public class Ex02 {

    public static void main(String[] args){

        ListaEncadeada<String> lista = new ListaEncadeada<>();
        for (int i = 1;i<=10;i++){
            lista.adiciona(""+i);

        }
        System.out.println(lista);
        lista.inverte();
        System.out.println(lista);


    }
}
