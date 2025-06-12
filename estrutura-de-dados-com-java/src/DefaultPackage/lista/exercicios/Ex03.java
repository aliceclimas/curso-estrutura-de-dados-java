package src.DefaultPackage.lista.exercicios;

public class Ex03 {

    public static void main(String[] args){
        PilhaEncadeada<Integer> pilha = new PilhaEncadeada<>();

        for (int i = 0;i<=10;i++){
            pilha.empila(i);
        }
        System.out.println(pilha);

        System.out.println(pilha.desempilha());
        System.out.println(pilha.desempilha());
        System.out.println(pilha.desempilha());

        System.out.println(pilha);
        System.out.println(pilha.estaVazia());
        System.out.println(pilha.topo());
        System.out.println(pilha.tamanho());
    }
}
