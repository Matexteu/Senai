package br.senai.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca extends Pessoa {

    private String id;
    private String nome;
    private ArrayList<Livro> lista;
    private String puxarLista;

    public Biblioteca(String id, String nome, Endereco endereco, ArrayList lista) {
        super(endereco);
        this.id = id;
        this.nome = nome;
        this.lista = lista;
    }

    public String getPuxarLista() {
        return puxarLista;
    }

    public void setPuxarLista(String puxarLista) {
        this.puxarLista = puxarLista;
    }

    public void mostrarFlo() {
        System.out.println(nome + "\n" + "Livros dispóniveis:");
        for (int i = 0; i < 5; i++) {
            System.out.println("- " + lista.get(i).getNome() + ", Escrito por: " + lista.get(i).getAutor());
            }
        System.out.println();
    }

    public void mostrarSj() {
        System.out.println(nome + "\n" + "Livros dispóniveis:");
        for (int i = 5; i < 10; i++) {
            System.out.println("- " + lista.get(i).getNome() + ", Escrito por: " + lista.get(i).getAutor());
        }
        System.out.println();
    }

    Scanner inserir = new Scanner(System.in);

    public void mostrar() {
        System.out.print("Procurar livros pelo escritor: ");
        setPuxarLista(inserir.nextLine());
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getAutor().equals(getPuxarLista())) {
                System.out.println(lista.get(i).getNome());
            }
        }
    }

}