package br.edu.unievangelica.core.enums;

import java.util.Arrays;
import java.util.List;

/**
 * Created by joao.lopes on 04/04/2017.
 */
public enum TipoDocumentoEnum {

    /* PI */
    BI("mensagem.bi"),

    /* PASSAPORTE */
    PASSAPORTE("mensagem.passaporte"),

    COMPROVANTE_ENDERECO("mensagem.comprovanteEndereco");

    public String nome;

    TipoDocumentoEnum(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static List<TipoDocumentoEnum> listarTipoDocumentoPessoa(){
        return Arrays.asList(TipoDocumentoEnum.BI, TipoDocumentoEnum.PASSAPORTE);
    }
}

