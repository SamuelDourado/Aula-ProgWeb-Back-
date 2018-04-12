package br.edu.unievangelica.core.enums;

public enum TipoTelefoneEnum {

	/* TIPO TELEFONE -> RESIDENCIAL */
	RESIDENCIAL("mensagem.residencial"),

	/* TIPO TELEFONE -> COMERCIAL */
	COMERCIAL("mensagem.comercial"),

	/* TIPO TELEFONE -> CELULAR */
	CELULAR("mensagem.celular");

	public String nome;

	TipoTelefoneEnum(String nome) {
		this.nome= nome;
	}
}
