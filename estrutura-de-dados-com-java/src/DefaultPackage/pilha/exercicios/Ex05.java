package src.DefaultPackage.pilha.exercicios;

import src.DefaultPackage.pilha.Pilha;

import java.util.Scanner;
import java.util.Stack;

public class Ex05 {

    public static void main(String[] args){

        imprimeResultado("ADA");
        imprimeResultado("ABCD");
        imprimeResultado("ABCCBA");
        imprimeResultado("Maria");

    }
    public static void imprimeResultado(String palavra){
        System.out.println(palavra + "é palíndromo ?" + testaPalindromo(palavra));
    }
    public static boolean testaPalindromo(String palavra){

        Pilha<Character> pilha = new Pilha<Character>();

        for (int i = 0;i<palavra.length();i++){
            pilha.empilha(palavra.charAt(i));
        }
        String palavraInversa = "";
        while(!pilha.estaVazia()){
            palavraInversa += pilha.desempilha();
        }
        if (palavraInversa.equalsIgnoreCase(palavra)){
            return true;

        }
        return false;

    }
}
