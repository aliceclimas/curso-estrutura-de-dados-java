package src.DefaultPackage.lista.exercicios;

import src.DefaultPackage.lista.ListaEncadeada;

public class PilhaEncadeada<T> {

    private ListaEncadeada<T> elementos;

    PilhaEncadeada(){
        this.elementos = new ListaEncadeada<>();
    }

    public void empila(T elemento){
        this.elementos.adiciona(elemento);
    }

    public boolean estaVazia(){
        return this.tamanho() == 0;
    }

    public T topo(){
        if (this.estaVazia()){
            return null;
        }
        return this.elementos.buscaPorPosicao(this.tamanho() - 1);
    }

    public int tamanho(){
        return this.elementos.getTamanho();
    }

    public T desempilha(){
        if (this.estaVazia()){
            return null;
        }
        return this.elementos.removeFinal();
    }

    public String toString(){
        return this.elementos.toString();
    }
}
