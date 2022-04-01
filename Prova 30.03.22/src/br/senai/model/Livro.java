package br.senai.model;

public class Livro {

    private String id;
    private String nome;
    private String autor;

    public Livro(String id, String nome, String autor) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

}