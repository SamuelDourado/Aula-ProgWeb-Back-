package br.edu.unievangelica.core.enums;

public enum StatusCobrancaEnum {

    PAGO("mensagem.pago"),
    PARCIALMENTEPAGO("mensagem.parcialmentepago"),
    PENDENTE("mensagem.pendente");

    public String nome;

    StatusCobrancaEnum(String nome) {
        this.nome = nome;
    }
}
