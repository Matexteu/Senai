package br.senai.model;

import java.util.Random;

public class Dados {

    private int dados;
    private int valor1;
    private int valor2;
    private int valor3;
    private int valor4;

    public int lancar() {
        Random numero = new Random();
        dados = (numero.nextInt(6) + 1);
        return dados;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getValor3() {
        return valor3;
    }

    public void setValor3(int valor3) {
        this.valor3 = valor3;
    }

    public int getValor4() {
        return valor4;
    }

    public void setValor4(int valor4) {
        this.valor4 = valor4;
    }

    public int soma1() {
        return valor1 + valor2;
    }

    public int soma2() {
        return valor3 + valor4;
    }

}