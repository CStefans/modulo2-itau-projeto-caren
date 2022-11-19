package br.com.letscode.turmaitau.generics;

public class Box {

    public Object conteudo;

    public void inserirConteudo(Object conteudo){
        Number number = (Number) conteudo;
        if (number.doubleValue() < 0 ){
            throw new RuntimeException("Valor nao pode ser negativo");
        }
        this.conteudo = number;
    }

    public void imprimirConteudo(){
        System.out.println(this.conteudo.toString());

    }
}
