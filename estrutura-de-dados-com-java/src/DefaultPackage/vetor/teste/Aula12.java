package src.DefaultPackage.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

    public static void main (String[] args){

        ArrayList<String> arrayList = new ArrayList<String>(); // classe mais usada em Java
        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList);

        arrayList.add(1,"B");

        System.out.println(arrayList);

        boolean existe = arrayList.contains("A");

        if (existe){
            System.out.println("Elemento existe no array");
        } else {
            System.out.println("Elemento não existe no array");
        }

        int pos = arrayList.indexOf("A");

        if (pos > -1){
            System.out.println("Elemento existe no array" + pos) ;
        } else {
            System.out.println("Elemento não existe no array" + pos);
        }

        System.out.println(arrayList.get(4)); // encontra a posicão

        arrayList.remove(0); // remove o índice
        arrayList.remove("A"); // remove o objeto

        System.out.println(arrayList.size()); // retorna o tamanho do array









    }
}
