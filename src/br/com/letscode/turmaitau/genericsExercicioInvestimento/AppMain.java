package br.com.letscode.turmaitau.genericsExercicioInvestimento;

import br.com.letscode.turmaitau.genericsExercicioInvestimento.cliente.Cliente;
import br.com.letscode.turmaitau.genericsExercicioInvestimento.cliente.ClienteArrojado;
import br.com.letscode.turmaitau.genericsExercicioInvestimento.cliente.ClienteConservador;
import br.com.letscode.turmaitau.genericsExercicioInvestimento.cliente.ClienteModerado;
import br.com.letscode.turmaitau.genericsExercicioInvestimento.investimento.*;
import br.com.letscode.turmaitau.genericsExercicioInvestimento.perfil.Arrojado;

public class AppMain {

    public static void main(String[] args) {

        var conservador = new ClienteConservador();

        conservador.contratarInvestimento(new CDB());
        conservador.contratarInvestimento(new Tesouro());
        //conservador.contratarInvestimento(new Acao());

        var arrojado = new ClienteArrojado();
        arrojado.contratarInvestimento(new Acao());
        arrojado.contratarInvestimento(new FundoImobiliario());
        //arrojado.contratarInvestimento(new Tesouro());

        var moderado = new ClienteModerado();
        moderado.contratarInvestimento(new Acao());
        moderado.contratarInvestimento(new FundoImobiliario());
        moderado.contratarInvestimento(new Tesouro());
        moderado.contratarInvestimento(new CDB());

        Cliente<Arrojado, RendaVariavel> arrojado2 = new ClienteArrojado();
        arrojado2.contratarInvestimento(new FundoImobiliario());


    }

}
