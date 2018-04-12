package br.edu.unievangelica.core.enums;

/**
 * Created by joao.lopes on 18/04/2017.
 */
public enum PrincipalTelefoneEnum {

    /* TELEFONE PRINCIPAL */
    PRINCIPAL("mensagem.principal"),

    /* TELEFONE SECUNDÁRIO */
    SECUNDARIO("mensagem.secundario");

    public String nome;

    PrincipalTelefoneEnum(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
