package br.senai;

import br.senai.model.ItensDoPedido;
import br.senai.model.Pedido;
import br.senai.model.Produto;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto("Nescau", 10);
        Produto p2 = new Produto("Toddynho", 5);
        Produto p3 = new Produto("Leite Moça", 2);
        Produto p4 = new Produto("Sucrilhos", 1.5);
        Produto p5 = new Produto("Yakult", 7);
        Produto p6 = new Produto("Leite Ninho", 3);
        Produto p7 = new Produto("Pó Royal", 100);
        Produto p8 = new Produto("Nescafé", 8);
        Produto p9 = new Produto("Caldo Knorr", 1000);
        Produto p10 = new Produto("Chiclete", 5);
        Produto p11 = new Produto("Modess", 0.5);
        Produto p12 = new Produto("Cotonetes", 12);
        Produto p13 = new Produto("OB", 10);
        Produto p14 = new Produto("Durex", 10);
        Produto p15 = new Produto("Band-aid", 10);
        Produto p16 = new Produto("Jeep", 10);
        Produto p17 = new Produto("Ray-Ban", 10);
        Produto p18 = new Produto("Super Bonder", 10);
        Produto p19 = new Produto("Pinho sol", 10);
        Produto p20 = new Produto("Lycra", 10);

        ItensDoPedido ip1 = new ItensDoPedido(p1, 1);
        ItensDoPedido ip2 = new ItensDoPedido(p2, 4);
        ItensDoPedido ip3 = new ItensDoPedido(p3, 7);
        ItensDoPedido ip4 = new ItensDoPedido(p4, 3);
        ItensDoPedido ip5 = new ItensDoPedido(p5, 2);
        ItensDoPedido ip6 = new ItensDoPedido(p6, 6);
        ItensDoPedido ip7 = new ItensDoPedido(p7, 5);
        ItensDoPedido ip8 = new ItensDoPedido(p8, 2);
        ItensDoPedido ip9 = new ItensDoPedido(p9, 1);
        ItensDoPedido ip10 = new ItensDoPedido(p10, 5);
        ItensDoPedido ip11 = new ItensDoPedido(p11, 4);
        ItensDoPedido ip12 = new ItensDoPedido(p12, 8);
        ItensDoPedido ip13 = new ItensDoPedido(p13, 6);
        ItensDoPedido ip14 = new ItensDoPedido(p14, 10);
        ItensDoPedido ip15 = new ItensDoPedido(p15, 19);
        ItensDoPedido ip16 = new ItensDoPedido(p16, 2);
        ItensDoPedido ip17 = new ItensDoPedido(p17, 2);
        ItensDoPedido ip18 = new ItensDoPedido(p18, 12);
        ItensDoPedido ip19 = new ItensDoPedido(p19, 3);
        ItensDoPedido ip20 = new ItensDoPedido(p20, 2);

        ArrayList<ItensDoPedido> lista1 = new ArrayList<>();
        ArrayList<ItensDoPedido> lista2 = new ArrayList<>();

        lista1.add(ip1);
        lista1.add(ip2);
        lista1.add(ip3);
        lista1.add(ip4);
        lista1.add(ip5);
        lista1.add(ip6);
        lista1.add(ip7);
        lista1.add(ip8);
        lista1.add(ip9);
        lista1.add(ip10);
        lista2.add(ip11);
        lista2.add(ip12);
        lista2.add(ip13);
        lista2.add(ip14);
        lista2.add(ip15);
        lista2.add(ip16);
        lista2.add(ip17);
        lista2.add(ip18);
        lista2.add(ip19);
        lista2.add(ip20);

        Pedido pedido1 = new Pedido("Comidas", "18/04");

        System.out.println("Pedido 1 " + "\n" + pedido1);
        for (int i = 0; i < lista1.size(); i++) {
            System.out.println(lista1.get(i).getProdutos().getNome() + ", Quantidade: " + lista1.get(i).getQuantidade());
        }

        double total1 = 0;
        for (int i = 0; i < lista1.size(); i++) {
            total1 += (lista1.get(i).getProdutos().getPreco() * lista1.get(i).getQuantidade());
        }

        System.out.println("\n" + "Valor total: R$" + total1);

        Pedido pedido2 = new Pedido("Coisas gerais", "19/05");

        System.out.println("\n" + "Pedido 2 " + "\n" + pedido2);
        for (int i = 0; i < lista2.size(); i++) {
            System.out.println(lista2.get(i).getProdutos().getNome() + ", Quantidade: " + lista2.get(i).getQuantidade());
        }

        double total2 = 0;
        for (int i = 0; i < lista1.size(); i++) {
            total2 += (lista2.get(i).getProdutos().getPreco() * lista2.get(i).getQuantidade());
        }

        System.out.println("\n" + "Valor total: R$" + total2);

    }

}