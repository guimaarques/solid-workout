package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado extends Funcionario {

    private String empresaTerceirizada;

    public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        super(nome, cpf, cargo, salario);
    }

    public String getEmpresaTerceirizada() {
        return empresaTerceirizada;
    }

    public void setEmpresaTerceirizada(String empresaTerceirizada) {
        this.empresaTerceirizada = empresaTerceirizada;
    }
}
