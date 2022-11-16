package br.com.letscode.turmaitau.bancoDadosInterfaces;

import br.com.letscode.turmaitau.genericsExercicioInvestimento.cliente.Cliente;

public class AppMain {

    public static void main(String[] args) {

        ConexaoDadosClientes conexaoDadosClientes = null;

        if (args[0].equals("FILE")) {
            conexaoDadosClientes = new ConexaoDadosClienteArquivo();
        } else if (args[0].equals("DATABASE")) {
            conexaoDadosClientes = new ConexaoBancoDados();
        } else if (args[0].equals("API")) {
            conexaoDadosClientes = new ConexaoAPI();
        } else if (args[0].equals("MONGODB")) {
            conexaoDadosClientes = new ConexaoDadosClientes() {
                @Override
                public void criarCliente() {
                    //conexao com mongodb
                }
                @Override
                public Cliente consultarCliente() {
                    return null;
                }
            };
        }

        conexaoDadosClientes.criarCliente();

        conexaoDadosClientes.excluir();






    }

}
