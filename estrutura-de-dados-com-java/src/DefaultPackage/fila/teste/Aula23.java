package src.DefaultPackage.fila.teste;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula23 {

    public static void main(String[] args){

        Queue<Integer> fila = new LinkedList<>(); // lista encadeada que representa uma fila

        fila.add(1);
        fila.add(2);

        System.out.println(fila);

        System.out.println(fila.peek());

        System.out.println(fila.remove());

        System.out.println(fila);






    }
}
