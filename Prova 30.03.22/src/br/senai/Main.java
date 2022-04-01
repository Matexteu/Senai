package br.senai;

import br.senai.model.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Livro> pratileira = new ArrayList();

        pratileira.add(new Livro("1", "O ataque Maluco", "Ronaldo"));
        pratileira.add(new Livro("2", "Todo Mundo Alegre", "Joaquim"));
        pratileira.add(new Livro("3", "Unidos e Juntos", "Joaquim"));
        pratileira.add(new Livro("4", "Risadas Gostosas", "Joana"));
        pratileira.add(new Livro("5", "Expresso do Oriente", "Richard"));
        pratileira.add(new Livro("6", "Bombardeio de Paraguasiguá", "Jeremias"));
        pratileira.add(new Livro("7", "Luas e Estrelas", "John"));
        pratileira.add(new Livro("8", "Morte do Bolo", "Fabricio"));
        pratileira.add(new Livro("9", "Caju Fatal", "Gabriel"));
        pratileira.add(new Livro("10", "Dançando Com as Cadeiras", "Naldo"));

        Endereco flo = new Endereco("1", "82733-000", "420");
        Endereco jose = new Endereco("2", "04545005", "510");

        Biblioteca floripa = new Biblioteca("1", "Biblioteca de Florianópolis", flo, pratileira);
        Biblioteca sao_jose = new Biblioteca("2", "Biblioteca de São José", jose, pratileira);

        floripa.mostrarFlo();
        sao_jose.mostrarSj();

        Endereco serra = new Endereco("1", "03318-000", "21");
        Autor ronaldo = new Autor("1", "Ronaldo", serra, pratileira.get(0).getNome());

        floripa.mostrar();

        ronaldo.bonus();
    }

}