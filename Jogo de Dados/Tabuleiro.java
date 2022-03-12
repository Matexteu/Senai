package br.senai.model;

import java.util.Scanner;

public class Tabuleiro {

    private int rodadas = 1;
    private int fim = 0;

    public void IniciarJogo() {

        Scanner inserir = new Scanner(System.in);
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();
        Dados jogada = new Dados();

            System.out.println("Insira os seguinte informações para começar a jogar:" + "\n");

            System.out.print("Nome do jogador 1: ");
            jogador1.setNome(inserir.nextLine());
            System.out.print("Nome do jogador 2: ");
            jogador2.setNome(inserir.nextLine());

            while (jogada.soma1() != 7 && jogada.soma2() != 7) {
                System.out.println("\n" + "Rodada " + rodadas);
                System.out.println("Vez de " + jogador1.getNome() + ", aperter Enter para rolar os dados.");
                inserir.nextLine();
                jogada.setValor1(jogada.lancar());
                jogada.setValor2(jogada.lancar());
                System.out.println("Dado 1: " + jogada.getValor1());
                System.out.println("Dado 2: " + jogada.getValor2());
                System.out.println("Valor Final: " + jogada.soma1());

                System.out.println("\n" + "Vez de " + jogador2.getNome() + ", aperter Enter para rolar os dados.");
                inserir.nextLine();
                jogada.setValor3(jogada.lancar());
                jogada.setValor4(jogada.lancar());
                System.out.println("Dado 1: " + jogada.getValor3());
                System.out.println("Dado 2: " + jogada.getValor4());
                System.out.println("Valor Final: " + jogada.soma2());

                if (jogada.soma1() == 7 && jogada.soma2() == 7) {
                    System.out.println("\n" + "Empate, continue jogando.");
                    jogada.setValor1(0);
                    jogada.setValor3(0);
                }
                rodadas += 1;
                fim += 1;
            }

            if (jogada.soma1() == 7) {
                System.out.println("\n" + jogador1.getNome() + ", você venceu.");
                System.out.println("Número de rodadas jogadas: " + fim);
            } else {
                System.out.println("\n" + jogador2.getNome() + ", você venceu.");
                System.out.println("Número de rodadas jogadas: " + fim);
            }

        }

}
