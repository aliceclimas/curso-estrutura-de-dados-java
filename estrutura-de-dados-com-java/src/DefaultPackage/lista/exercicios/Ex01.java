package src.DefaultPackage.lista.exercicios;

import src.DefaultPackage.lista.ListaEncadeada;
import src.DefaultPackage.vetor.Vetor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Ex01 {

    public static void main(String[] args){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        for (int i = 0;i<=10;i++){
            lista.adiciona(i);
        }
        System.out.println(lista);

        System.out.println(Arrays.toString(transformaArray(lista)));

        System.out.println(Arrays.toString(lista.transformaArray()));

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1;i<=10;i++){
            list.add(i);
        }

    }
    public static int[] transformaArray(ListaEncadeada<Integer> lista){
        int tamanho = lista.getTamanho();
        int[] vetor = new int[tamanho];
        for (int i = 0;i<tamanho;i++){
            vetor[i] = lista.buscaPorPosicao(i);

        }
        return vetor;

    }


}
