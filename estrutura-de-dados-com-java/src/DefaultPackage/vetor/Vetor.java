package src.DefaultPackage.vetor;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

//    public void adiciona(String elemento){
//
//        for (int i = 0;i<this.elementos.length;i++){
//            if (this.elementos[i] == null){
//                this.elementos[i] = elemento;
//                break;
//            }
//        }
//
//    }

    public boolean adiciona(String elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, String elemento){
        this.aumentaCapacidade();
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        this.aumentaCapacidade();
        // mover todos os elementos
        for (int i =this.tamanho-1;i>=posicao;i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }
    private void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length){
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0;i<this.elementos.length;i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

//    public String busca(int posicao){ //aula05
//        if (!(posicao >=0 && posicao < tamanho)){
//            throw new IllegalArgumentException("Posição inválida");
//        }
//        return this.elementos[posicao];
//    }

    public int busca(String elemento){
        for (int i = 0;i<this.tamanho;i++){
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;

    }
    // B G D E F -> posição a ser reovida é 1 (G)
    // B D D E F
    // B D E E F
    // B D E F
    // 0 1 2 3 4 -> tamanho é 5
    // vetor[1] = vetor[2]
    // vetor[2] = vetor[3]
    // vetor[3] = vetor[4]
    public void remove(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posicão inválida");
        }
        for (int i=posicao;i<this.tamanho-1;i++) {
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(" , ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");

        return s.toString();
    }
}