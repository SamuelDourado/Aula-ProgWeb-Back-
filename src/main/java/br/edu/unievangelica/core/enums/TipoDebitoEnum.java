package br.edu.unievangelica.core.enums;

public enum TipoDebitoEnum {

    CREDITOAVISTA("mensagem.creditoavista"),
    CREDITOPARCELADO("mensagem.creditoparcelado"),
    DEBITOAVISTA("mensagem.debitoavista");

    public String nome;

    TipoDebitoEnum(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
