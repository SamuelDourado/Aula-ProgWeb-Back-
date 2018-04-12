package br.edu.unievangelica.core.enums;

public enum DiaSemanaEnum {

	DOMINGO("mensagem.domingo"),

	SEGUNDA("mensagem.segunda"),

	TERCA("mensagem.terca"),

	QUARTA("mensagem.quarta"),

	QUINTA("mensagem.quinta"),

	SEXTA("mensagem.sexta"),

	SABADO("mensagem.sabado");

	public String nome;

	DiaSemanaEnum(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
