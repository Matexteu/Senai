package br.senai;

import br.senai.model.Endereco;
import br.senai.model.PessoaFisica;
import br.senai.model.PessoaJuridica;

public class Main {

    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica("Ronaldo", "276.238.689-67", "783423-0");
        Endereco pfEndereco = new Endereco("Fransisco Furtado", 160, "Saco Grande", "18298-001");

        PessoaJuridica pj = new PessoaJuridica("Bom de Boca", "72.273.999/0001-75", "388.108.598.269");
        Endereco pjEndereco = new Endereco("Gina Fransisca", 25, "João Paulo", "12534-223");

        System.out.println(pf + "\n" + pfEndereco);
        System.out.println("\n" + pj + "\n" + pjEndereco);

    }

}
