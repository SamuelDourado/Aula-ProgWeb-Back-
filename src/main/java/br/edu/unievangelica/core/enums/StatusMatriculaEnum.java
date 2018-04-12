package br.edu.unievangelica.core.enums;

public enum StatusMatriculaEnum {

	MATRICULA("mensagem.matricula"),

	PREMATRICULA("mensagem.preMatricula"),

	REMATRICULA("mensagem.reMatricula"),

	CANCELADO("mensagem.cancelado");

	public String nome;

	StatusMatriculaEnum(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
