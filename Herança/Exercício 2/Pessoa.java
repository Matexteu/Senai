package br.senai.model;

public abstract class Pessoa {

    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;

    public Pessoa(String nome, String sobrenome, String email, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome + ", " + email + ", " + telefone;
    }

}