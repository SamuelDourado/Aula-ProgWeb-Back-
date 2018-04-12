package br.edu.unievangelica.core.enums;

public enum TipoPagamentoEnum {

    DEBITO("mensagem.debito"),
    DINHEIRO("mensagem.dinheiro"),
    DEPOSITO("mensagem.deposito");

    public String nome;

    TipoPagamentoEnum(String nome) {
        this.nome = nome;
    }
}
