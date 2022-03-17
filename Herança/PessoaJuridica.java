package br.senai.model;

public class PessoaJuridica extends Pessoa{

    private String cnpj;
    private String ie;

    public PessoaJuridica(String nome, String cnpj, String ie) {
        super(nome);
        this.cnpj = cnpj;
        this.ie = ie;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    @Override
    public String toString() {
        return super.toString() + "CNPJ: " + cnpj + "IE: " + ie;
    }
}
