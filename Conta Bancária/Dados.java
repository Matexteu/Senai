package br.senai.model;

public class Dados {

    private String nome;
    private String conta;
    private double saldo = 0;

    public double sacar(double valor) {
        return saldo -= valor + 5;
    }

    public double depositar(double valor) {
        return saldo += valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}