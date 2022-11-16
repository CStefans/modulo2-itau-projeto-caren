package br.com.letscode.turmaitau.genericsExercicioInvestimento.cliente;

import br.com.letscode.turmaitau.genericsExercicioInvestimento.investimento.Investimento;
import br.com.letscode.turmaitau.genericsExercicioInvestimento.perfil.ClientePerfil;

public abstract class Cliente<T extends ClientePerfil, U extends Investimento> {


    public void contratarInvestimento(U investimento) {
        System.out.println("contratando = " + investimento.getClass());
    }


}
