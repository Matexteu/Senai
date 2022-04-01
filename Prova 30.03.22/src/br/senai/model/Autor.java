package br.senai.model;

public class Autor extends Pessoa {

    private String id;
    private String livro;

    public Autor(String id, String nome, Endereco endereco, String livro) {
        super(nome, endereco);
        this.id = id;
        this.livro = livro;
    }

    public void bonus() {
        System.out.println("\n" + super.getNome() + ", " + livro);
    }


}
