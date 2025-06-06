package src.DefaultPackage.fila.exercicios;

import src.DefaultPackage.fila.Documento;
import src.DefaultPackage.fila.Fila;

public class Ex01Loiane {

    public static void main(String[] args){

        Fila<Documento> filaImpressora = new Fila<Documento>();

        filaImpressora.enfileira(new Documento("A",1));
        filaImpressora.enfileira(new Documento("B",2));
        filaImpressora.enfileira(new Documento("C",3));
        filaImpressora.enfileira(new Documento("D",7));
        filaImpressora.enfileira(new Documento("E",9));

        while(!filaImpressora.estaVazia()){
            Documento doc = filaImpressora.desenfileira();
            System.out.println("Imprimindo documento" + doc.getNome());
            try{
                Thread.sleep(200 * doc.getQtdFolhas());
            }catch (InterruptedException e){
                e.printStackTrace();

            }
        }
        System.out.println("Todos os documento foram impressoes");

    }
}
