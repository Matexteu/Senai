package br.senai;

import br.senai.model.Cliente;
import br.senai.model.Funcionario;

public class Main {

    public static void main(String[] args) {

        Funcionario pedreiro = new Funcionario("Ronaldo",
                "Ferreira",
                "Rofe@gmail.com",
                "(48) 98473-2202",
                "Pedreiro",
                2000);

        Cliente cliente = new Cliente("Jorge",
                "Almeida",
                "Joal@gmail.com",
                "(48) 98874-0083",
                "17/03");


        System.out.println(pedreiro +"\n" +
                "contrado por" + "\n" +
                cliente);

    }

}