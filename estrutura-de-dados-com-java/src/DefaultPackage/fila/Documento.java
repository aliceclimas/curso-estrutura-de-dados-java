package src.DefaultPackage.fila;

import javax.print.Doc;

public class Documento {

    private String nome;
    private int qtdFolhas;

    private int prioridade;

    public Documento(String nome, int qtdFolhas) {
        this.nome = nome;
        this.qtdFolhas = qtdFolhas;
    }
    public Documento(String nome, int qtdFolhas, int prioridade) {
        this.nome = nome;
        this.qtdFolhas = qtdFolhas;
        this.prioridade = prioridade;
    }

    public Documento(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdFolhas() {
        return qtdFolhas;
    }

    public void setQtdFolhas(int qtdFolhas) {
        this.qtdFolhas = qtdFolhas;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "nome='" + nome + '\'' +
                ", qtdFolhas=" + qtdFolhas +
                ", prioridade=" + prioridade +
                '}';
    }
}
