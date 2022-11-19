package br.com.letscode.turmaitau.generics;

import java.util.ArrayList;
import java.util.List;

public class BoxMain {
    public static void main(String[] args) {
        Box box = new Box();
        box.inserirConteudo(99);
        box.imprimirConteudo();
        
        List nomes = new ArrayList();
        nomes.add("caren");
        nomes.add("ralph");
        nomes.add("Loki");
        nomes.add(99);

        for (int i=0; i <nomes.size(); i++){
            if(nomes.get(i) instanceof String) {
                String nome = (String) nomes.get(i);
                System.out.println(nome);
            }
        }
    }
}
