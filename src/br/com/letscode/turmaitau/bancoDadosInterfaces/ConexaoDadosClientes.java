package br.com.letscode.turmaitau.bancoDadosInterfaces;

import br.com.letscode.turmaitau.genericsExercicioInvestimento.cliente.Cliente;

public interface ConexaoDadosClientes {

    void criarCliente();

    Cliente consultarCliente();

    default void excluir() {

    }

}
