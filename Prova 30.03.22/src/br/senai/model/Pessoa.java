package br.senai.model;

public abstract class Pessoa {

    private String nome;
    private Endereco endereco;

    public Pessoa(Endereco endereco) {}
    public Pessoa(String nome, Endereco endereco) {}

    public String getNome() {
        return nome;
    }

}
