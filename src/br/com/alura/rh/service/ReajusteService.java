package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class ReajusteService {

    private List<ValidacaoReajustes> validacoes;

    public ReajusteService(List<ValidacaoReajustes> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalarioDoFuncionaro(Funcionario funcionario, BigDecimal aumento){
        this.validacoes.forEach(validacao -> validacao.validar(funcionario, aumento));

        var salarioReajustado = funcionario.getDadosPessoais().getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
