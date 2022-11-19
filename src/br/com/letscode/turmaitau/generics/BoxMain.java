package br.com.letscode.turmaitau.generics;

import java.util.ArrayList;
import java.util.List;

public class BoxMain {
    public static void main(String[] args) {
        Box box = new Box();
        box.inserirConteudo(99);
        box.imprimirConteudo();

        BoxGenerics<Double> box2 = new BoxGenerics<>();
        box2.inserirConteudo(2.0);
        box2.imprimirConteudo();
        
        List nomes = new ArrayList();
        nomes.add("caren");
        nomes.add("ralph");
        nomes.add("Loki");
        nomes.add(88);

        for (int i=0; i <nomes.size(); i++){
            if(nomes.get(i) instanceof String) {
                String nome = (String) nomes.get(i);
                System.out.println(nome);
            }
        }
    }

    //com extends eh de string pra baixo com o super eh de strings pra cima
    public void imprimirListString(List<? super String> nomes){

    }

    public <T extends Number> void imprimirValor(T valor) {

    }
}
