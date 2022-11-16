package br.com.letscode.turmaitau.colecoes;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> cidades = new ArrayList<>();

        cidades.add("Sao Paulo");
        cidades.add("Campinas");
        cidades.add("Curitiba");
        cidades.add("Rio de Janeiro");
        cidades.add("Sao Paulo");
        cidades.add("Campinas");

        for (String nomeCidade: cidades){
            System.out.println(nomeCidade);
        }

    }
}
