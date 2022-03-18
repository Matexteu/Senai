package br.senai.model;

public class Pedido {

    private String descricao;
    private String data;

    public Pedido(String descricao, String data) {
        this.descricao = descricao;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Descrição do pedido: " + descricao +
                "\nData do pedido: " + data + "\n";
    }
}
