package br.senai.model;

public class ItensDoPedido {

    private Produto produtos;
    private int quantidade;

    public ItensDoPedido(Produto produtos, int quantidade) {
        this.produtos = produtos;
        this.quantidade = quantidade;
    }

    public Produto getProdutos() {
        return produtos;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return produtos + "Quantidade: " + quantidade;
    }

}
