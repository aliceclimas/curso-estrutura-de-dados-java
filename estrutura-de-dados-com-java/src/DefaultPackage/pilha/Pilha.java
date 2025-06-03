package src.DefaultPackage.pilha;

import src.DefaultPackage.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica {

    public Pilha(){
        super();
    }
    public Pilha(int capacidade){
        super(capacidade);
    }
    public void empilha(T elemento){
        super.adiciona(elemento);
    }

    public T topo(){
        if(this.estaVazia()){
            return null;
        }
        return (T) this.elementos[this.tamanho-1];
    }
}
