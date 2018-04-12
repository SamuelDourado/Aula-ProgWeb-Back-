package br.edu.unievangelica.core.enums;

public enum TipoEnderecoEnum {

	/* TIPO ENDERECO -> RESIDENCIAL */
	RESIDENCIAL("mensagem.residencial"),

	/* TIPO ENDERECO -> COMERCIAL */
	COMERCIAL("mensagem.comercial");

	public String nome;

	TipoEnderecoEnum(String nome) {
		this.nome= nome;
	}
}
