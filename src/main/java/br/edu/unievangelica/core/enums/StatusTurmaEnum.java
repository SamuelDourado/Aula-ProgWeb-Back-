package br.edu.unievangelica.core.enums;

public enum StatusTurmaEnum {

	ABERTA("mensagem.aberta"),
	FECHADA("mensagem.fechada"),
	EMANDAMENTO("mensagem.emAndamento"),
	FINALIZADA("mensagem.finalizada"),
	ENCERRADA("mensagem.encerrada");

	public String nome;

	StatusTurmaEnum(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
