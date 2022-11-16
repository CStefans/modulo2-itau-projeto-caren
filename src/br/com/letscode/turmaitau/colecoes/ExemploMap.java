package br.com.letscode.turmaitau.colecoes;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {

        //nao mantem a ordem
        //pede uma chave e nao repete ela se usar keyset

        Map<String, String> cidades = new HashMap<>();

        cidades.put("SP","Sao Paulo");
        cidades.put("CA", "Campinas");
        cidades.put("CT","Curitiba");
        cidades.put("RJ","Rio de Janeiro");
        cidades.put("SP","Sao Paulo");
        cidades.put("CA","Campinas");
        cidades.put("CP","Campinas");

        List<String> cidadesList = new ArrayList<>();
        for(String chaveCidade: cidades.keySet()){
            String nomeCidade = cidades.get(chaveCidade);
            System.out.println(chaveCidade + " - " + nomeCidade);
            cidadesList.add(nomeCidade);
        }

        Collections.sort(cidadesList);

        System.out.println("Lambda 1");
        cidadesList.forEach(nomeCidade -> System.out.println(nomeCidade));

        System.out.println("Lambda 2");
        cidadesList.forEach(System.out::println);

        System.out.println("Lambda 3 Map");
        cidades.forEach((chave,valor) -> System.out.println(valor));
    }
}
