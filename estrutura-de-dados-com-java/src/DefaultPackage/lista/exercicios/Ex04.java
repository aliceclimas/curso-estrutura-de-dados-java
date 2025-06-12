package src.DefaultPackage.lista.exercicios;

import src.DefaultPackage.fila.Fila;

public class Ex04 {

    public static void main(String[] args){
        FilaEncadeada<Integer> fila = new FilaEncadeada<>();

        for (int i = 0;i<10;i++){
            fila.enfileira(i);
        }

        System.out.println(fila);

        System.out.println(fila.desinfileira());

        System.out.println(fila.espiar());

        System.out.println(fila);
    }
}
