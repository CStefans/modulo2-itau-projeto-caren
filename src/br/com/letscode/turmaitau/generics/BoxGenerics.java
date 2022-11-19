package br.com.letscode.turmaitau.generics;

public class BoxGenerics <T extends Number> {

    public T conteudo;

    public void inserirConteudo(T conteudo){
        if (conteudo.doubleValue() < 0 ){
            throw new RuntimeException("Valor nao pode ser negativo");
        }
        this.conteudo = conteudo;
    }

    public void imprimirConteudo(){
        System.out.println(this.conteudo.toString());

    }
}
