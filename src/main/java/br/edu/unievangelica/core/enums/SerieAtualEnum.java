package br.edu.unievangelica.core.enums;

public enum SerieAtualEnum {

	PRIMEIROPERIODO("mensagem.primeiroPeriodo"),
	SEGUNDOPERIODO("mensagem.segundoPeriodo"),
	TERCEIROPERIODO("mensagem.terceiroPeriodo"),
	QUARTOPERIODO("mensagem.quartoPeriodo"),
	QUINTOPERIODO("mensagem.quintoPeriodo"),
	SEXTOPERIODO("mensagem.sextoPeriodo"),
	SETIMOPERIODO("mensagem.setimoPeriodo"),
	OITAVOPERIODO("mensagem.oitavoPeriodo"),
	NONOPERIODO("mensagem.nonoPeriodo"),
	DECIMOPERIODO("mensagem.decimoPeriodo"),
	DECIMOPRIMEIROPERIODO("mensagem.decimoPrimeiroPeriodo"),
	DECIMOSEGUNDOPERIODO("mensagem.decimoSegundoPeriodo");

	public String nome;

	SerieAtualEnum(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
