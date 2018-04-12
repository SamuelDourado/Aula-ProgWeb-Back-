package br.edu.unievangelica.core.enums;

/**
 * Created by joao.lopes on 18/05/2017.
 */
public enum TitulacaoEnum {

    /* GRADUAÇÃO */
    GRADUACAO("mensagem.graduacao"),

    /* PÓS-GRADUAÇÃO */
    POSGRADUACAO("mensagem.posGraduacao"),

    /* MESTRADO */
    MESTRADO("mensagem.mestrado");


    public String nome;

    TitulacaoEnum(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
