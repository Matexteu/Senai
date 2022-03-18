package br.senai.model;

public class Cliente extends Pessoa {

    private String dataCadastro;

    public Cliente(String nome, String sobrenome, String email, String telefone, String dataCadastro) {
        super(nome, sobrenome, email, telefone);
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return super.toString() + ", Data do registro: " + dataCadastro;
    }
}
