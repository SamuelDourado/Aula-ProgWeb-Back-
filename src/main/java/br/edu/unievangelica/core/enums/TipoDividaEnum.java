package br.edu.unievangelica.core.enums;

public enum TipoDividaEnum {
    MENSALIDADE("mensagem.mensalidade"),
    EMOLUMENTO("mensagem.emolumento");

    public String nome;

    TipoDividaEnum(String nome) {
        this.nome = nome;
    }
}
