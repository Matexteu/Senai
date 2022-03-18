package br.senai.model;

public class Funcionario extends Pessoa {

    private String funcao;
    private double salario;

    public Funcionario(String nome, String sobrenome, String email, String telefone, String funcao, double salario) {
        super(nome, sobrenome, email, telefone);
        this.funcao = funcao;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + ", (" + funcao + " -> Salário: R$" + salario + ")";
    }

}