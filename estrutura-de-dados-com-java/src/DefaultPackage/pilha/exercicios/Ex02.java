package src.DefaultPackage.pilha.exercicios;

import src.DefaultPackage.pilha.Pilha;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Pilha<Integer> pilhaPar = new Pilha<Integer>();
        Pilha<Integer> pilhaImpar = new Pilha<Integer>();

        for (int i = 0;i<=10;i++){

            System.out.println("Digite um número inteiro");

            int elemento = scan.nextInt();

            if (elemento == 0){

                Integer desempilhado = pilhaPar.desempilha();

                if (desempilhado == null){
                    System.out.println("Pilha par vazia");
                } else {
                    System.out.println("Desempilhando da pilha par: "+desempilhado);
                }

                desempilhado = pilhaImpar.desempilha();

                if (desempilhado == null){
                    System.out.println("Pilha ímpar vazia");
                } else {
                    System.out.println("Desempilhando da pilha ímpar: "+desempilhado);
                }

            } else if (elemento % 2 == 0){
                System.out.println("Número par, empilhando na pilha par: "+elemento);
                pilhaPar.empilha(elemento);
            } else {
                System.out.println("Número ímpar, empilhando na pilha ímpar: "+elemento);
                pilhaImpar.empilha(elemento);
            }

        }
        System.out.println("Desempilhando todos os números da pilha par");

        while (!pilhaPar.estaVazia()){
            System.out.println("Desempilhando da pilha par: "+ pilhaPar.desempilha());
        }

        System.out.println("Desempilhando todos os números da pilha ímpar");

        while (!pilhaImpar.estaVazia()){
            System.out.println("Desempilhando da pilha ímpar: "+ pilhaImpar.desempilha());
        }





    }
}
