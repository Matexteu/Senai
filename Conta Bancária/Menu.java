package br.senai.model;

public class Menu {

    private String numero;
    private int parar;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getParar() {
        return parar;
    }

    public void setParar(int parar) {
        this.parar = parar;
    }

    @Override
    public String toString() {
        return "\n" + "/////Menu/////" + "\n" +
                "Digite um dos números abaixo para selecionar a opção:" + "\n" +
                "1 - Ver saldo" + "\n" +
                "2 - Sacar" + "\n" +
                "3 - Depositar" + "\n" +
                "4 - Mudar o titular da conta" + "\n" +
                "5 - Fechar o menu" + "\n" +
                "//////////////" + "\n";
    }
}
