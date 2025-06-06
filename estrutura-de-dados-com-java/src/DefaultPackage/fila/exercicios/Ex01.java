package src.DefaultPackage.fila.exercicios;

import src.DefaultPackage.fila.Documento;


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ex01 {

    public static void main(String[] args){

        Queue<Documento> filaComPrioridade = new PriorityQueue<>(
                new Comparator<Documento>() {
                    @Override
                    public int compare(Documento d1, Documento d2) {

                        return Integer.valueOf(d1.getPrioridade()).compareTo(d2.getPrioridade());

//                        if (p1.getPrioridade() > p2.getPrioridade()){
//                            return 1;
//                        } else if (p1.getPrioridade() < p2.getPrioridade()){
//                            return -1;
//                        }
//                        return 0;
                    }
                }

        );

        filaComPrioridade.add(new Documento("Documento 1",20,2));
        filaComPrioridade.add(new Documento("Documento 2",10,1));
        filaComPrioridade.add(new Documento("Documento 3",30,3));



        System.out.println(filaComPrioridade);

        filaComPrioridade.remove();


    }
}
