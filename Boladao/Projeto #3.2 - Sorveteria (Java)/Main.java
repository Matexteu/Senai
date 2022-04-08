package br.senai;

import br.senai.model.Data;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Data dados = new Data();
        Scanner inserir = new Scanner(System.in);

        System.out.print("Insira o Nome: ");
        dados.setNome(inserir.nextLine());
        System.out.print("Insira o E-mail: ");
        dados.setEmail(inserir.nextLine());
        System.out.print("Insira o Telefone: ");
        dados.setTelefone(inserir.nextLine());
        System.out.print("Insira o Endereço: ");
        dados.setEndereco(inserir.nextLine());
        System.out.print("Insira a sua forma de pagamento: ");
        dados.setPagamento(inserir.nextLine());

        System.out.println(dados);


    }

}
