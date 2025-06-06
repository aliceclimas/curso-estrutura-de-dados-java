package src.DefaultPackage.fila;

import src.DefaultPackage.fila.FilaComPrioridade;

public class PSAtendimento  implements  Runnable{

    private FilaComPrioridade<Pessoa> fila;

    public PSAtendimento(FilaComPrioridade<Pessoa> fila) {
        this.fila = fila;
    }

    @Override
    public void run() {

        while(!fila.estaVazia()){
            try {
                System.out.println(fila.desenfileira() + " foi atendida.");
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();

            }
        }
        System.out.println("Atendimento concluído");

    }
}
