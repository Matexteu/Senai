package br.senai.model;

import java.util.Scanner;

public class Repeticao {

    Dados dados1 = new Dados();
    Scanner inserir = new Scanner(System.in);
    Menu menu = new Menu();

    public void saque() {

        System.out.print("Insira o valor: ");
        dados1.sacar(Integer.parseInt(inserir.nextLine()));
        System.out.println("\n" + "Saldo atual: " + dados1.getSaldo() + "\n");

        while (menu.getParar() != 2) {
            System.out.println("Deseja fazer outro saque?" + "\n" +
                                "1 - Sim" + "\n" +
                                "2 - Não" + "\n");
            System.out.print("Opção: ");
            menu.setNumero(inserir.nextLine());
            if (menu.getNumero().equals("1")) {
                saque();
            } else if (menu.getNumero().equals("2")) {
                menuVoltar();
            } else {
                System.out.println("Digite uma das opções disponíveis por favor" + "\n");
            }
        }

    }

    public void deposito() {

        System.out.print("Insira o valor: ");
        dados1.depositar(Integer.parseInt(inserir.nextLine()));
        System.out.println("\n" + "Saldo atual: " + dados1.getSaldo());

        while (menu.getParar() != 2) {
            System.out.println("\n" + "Deseja fazer outro depósito?" + "\n" +
                                "1 - Sim" + "\n" +
                                "2 - Não" + "\n");
            System.out.print("Opção: ");
            menu.setNumero(inserir.nextLine());
            if (menu.getNumero().equals("1")) {
                deposito();
            } else if (menu.getNumero().equals("2")) {
                menuVoltar();
            } else {
                System.out.println("Digite uma das opções disponíveis por favor" + "\n");
            }
        }

    }

    public void titular() {

        System.out.print("\n" + "Novo nome do titular da conta: ");
        dados1.setNome(inserir.nextLine());
        System.out.println("\n" + "Conta: " + dados1.getNome() + "\n"
                                + "Número da conta: " + dados1.getConta());

        while (menu.getParar() != 2) {
            System.out.println("\n" + "Deseja mudar novamente o titular da conta?" + "\n" +
                                "1 - Sim" + "\n" +
                                "2 - Não" + "\n");
            System.out.print("Opção: ");
            menu.setNumero(inserir.nextLine());
            if (menu.getNumero().equals("1")) {
                titular();
            } else if (menu.getNumero().equals("2")) {
                menuVoltar();
            } else {
                System.out.println("Digite uma das opções disponíveis por favor" + "\n");
            }
        }

    }

    public void menuVoltar() {

        while (menu.getParar() != (2)) {
            System.out.println("\n" + "Deseja voltar para o menu?" + "\n" +
                    "1 - Sim" + "\n" +
                    "2 - Fechar o menu" + "\n");
            System.out.print("Opção: ");
            menu.setNumero(inserir.nextLine());
            if (menu.getNumero().equals("1")) {
                menu();
            } else if (menu.getNumero().equals("2")) {
                System.out.println("\n" + "O serviço será encerrado, tenha um bom dia");
                menu.setParar(2);
            } else {
                System.out.println("Digite um dos dois números por favor");
                menuVoltar();
            }
        }

    }

    public void depósitoInicial() {
        
        while (menu.getParar() != (1)) {
            System.out.print("Deposíto de valor inicial: ");
            dados1.setSaldo(Integer.parseInt(inserir.nextLine()));
            if (dados1.getSaldo() < 0) {
                System.out.println("Não foi possível depositar esse valor, tente com outro valor" + "\n");
            } else {
                menu.setParar(1);
            }
        }
        
    }

    public void inicio() {

        System.out.println("Informe o seu nome e o número da sua conta para podermos pegar a sua conta");
        System.out.print("\n" + "Nome: ");
        dados1.setNome(inserir.nextLine());
        System.out.print("Número da conta: ");
        dados1.setConta(inserir.nextLine());
        depósitoInicial();
        System.out.println("\n" + "Bem vindo(a) " + dados1.getNome() + ", no que podemos te ajudar?");

    }

    public void menu() {

        System.out.println(menu);
        System.out.print("Opção: ");
        menu.setNumero(inserir.nextLine());
        while (menu.getParar() != (2)) {
            if (menu.getNumero().equals("1")) {
                System.out.println("\n" + "Saldo da conta: " + dados1.getSaldo());
                menuVoltar();
            } else if (menu.getNumero().equals("2")) {
                saque();
            } else if (menu.getNumero().equals("3")) {
                deposito();
            } else if (menu.getNumero().equals("4")) {
                titular();
            } else if (menu.getNumero().equals("5")) {
                System.out.println("\n" + "O serviço será encerrado, tenha um bom dia");
                menu.setParar(2);
            } else {
                System.out.println("Digite uma das opções disponíveis por favor" + "\n");
                menu();
            }
            
        }

    }

}
