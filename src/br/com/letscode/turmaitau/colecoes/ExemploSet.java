package br.com.letscode.turmaitau.colecoes;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        Set<String> cidades = new LinkedHashSet<>();

        cidades.add("Sao Paulo");
        cidades.add("Campinas");
        cidades.add("Curitiba");
        cidades.add("Rio de Janeiro");
        cidades.add("Sao Paulo");
        cidades.add("Campinas");

        for (String nomeCidade: cidades){
            System.out.println(nomeCidade);
        }

        List<String> cidadesList = Arrays.asList(cidades.toString());
        Collections.sort(cidadesList);

        for (String nomeCidade: cidadesList){
            System.out.println(nomeCidade);
        }
    }
}
