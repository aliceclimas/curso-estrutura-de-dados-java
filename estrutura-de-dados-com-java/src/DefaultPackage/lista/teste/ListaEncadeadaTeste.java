package src.DefaultPackage.lista.teste;

import src.DefaultPackage.lista.ListaEncadeada;

import java.util.LinkedList;
import java.util.List;

public class ListaEncadeadaTeste {

    public static void main(String[] args){
        //testesIniciais();
        //adicionaInicio();
        //adicionaPosicao();
        //removeInicio();
        //removeFinal();
        //removePosicao();
        testeLinkedList();

    }
    public static void testeLinkedList(){
        LinkedList<Integer> lista = new LinkedList<>();

        lista.add(1);
        lista.addFirst(0);
        lista.addLast(3);

        System.out.println(lista.contains(0));

        lista.add(2,2);
        System.out.println(lista);

        lista.remove(0);
        lista.removeFirst();
        lista.removeLast();

        System.out.println(lista);
    }
    public static void removePosicao(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        lista.adiciona(4);
        lista.adiciona(10);

        System.out.println("Elemento removido: "+lista.remove(8));
        System.out.println("Lista: "+lista);
    }

    public static void removeFinal(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);

        System.out.println("Elemento removido: " + lista.removeFinal());
        System.out.println("Lista:" + lista );

        System.out.println("Elemento removido: " + lista.removeFinal());
        System.out.println("Lista:" + lista );

        System.out.println("Elemento removido: " + lista.removeFinal());
        System.out.println("Lista:" + lista );

    }
    public static  void removeInicio(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        //lista.removeInicio();
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);

        System.out.println(lista.removeInicio());
        System.out.println(lista);
    }
    public static void adicionaPosicao(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(4); // 1, 2, 4
        lista.adiciona(0,0); // 0, 1, 2, 4
        lista.adiciona(4,5); // 0, 1, 2, 4, 5
        lista.adiciona(2,3);

        System.out.println(lista);

    }

    public static void adicionaInicio(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adicionaInicio(3);
        lista.adicionaInicio(2);
        lista.adicionaInicio(1);

        System.out.println(lista);
    }

    public static void testesIniciais(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adiciona(1);

        System.out.println("Tamanho = "+lista.getTamanho());
        System.out.println(lista);

        lista.adiciona(2);
        System.out.println(lista);

        lista.adiciona(3);
        System.out.println(lista);

        System.out.println("--- Busca por elemento ---");
        System.out.println(lista.busca(1));
        System.out.println(lista.busca(2));
        System.out.println(lista.busca(3));
        System.out.println(lista.busca(0));
        System.out.println("--- Busca por posição ---");
        System.out.println(lista.buscaPorPosicao(0));
        System.out.println(lista.buscaPorPosicao(1));
        System.out.println(lista.buscaPorPosicao(2));
        //System.out.println(lista.buscaPorPosicao(-1));
        //System.out.println(lista.buscaPorPosicao(4));

    }
}
