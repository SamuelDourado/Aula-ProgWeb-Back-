package br.edu.unievangelica.core.enums;

public enum TipoDidaticaEnum {

	TEORICA("mensagem.teorica"),
	PRATICA("mensagem.pratica"),
	TEORICAPRATICA("mensagem.teoricaPratica");

	public String nome;

	TipoDidaticaEnum(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
