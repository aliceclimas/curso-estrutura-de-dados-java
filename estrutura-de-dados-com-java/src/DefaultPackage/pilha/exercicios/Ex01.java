package src.DefaultPackage.pilha.exercicios;

import src.DefaultPackage.pilha.Pilha;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Pilha<Integer> pilha = new Pilha<>(10);

        for (int i = 0;i<10;i++){

            System.out.println("Digite um número inteiro");
            int elemento = scan.nextInt();

            if (elemento % 2 == 0){
                pilha.empilha(elemento);
            } else {
                Integer desempilhado= pilha.desempilha();

                if (desempilhado == null) {
                    System.out.println("A pilha está vazia");
                } else {
                    System.out.println("Número ímpar, desempilhando um elemento da pilha: " + desempilhado);
                    pilha.desempilha();
                }
            }

        }
        System.out.println("Todos os números foram lidos, desempilhando números da pilha");
        while(!pilha.estaVazia()){
            System.out.println("Desempilhando um elemento da pilha "+pilha.desempilha());
        }
        System.out.println("Todos os elementos foram desempilhados");
    }
}
