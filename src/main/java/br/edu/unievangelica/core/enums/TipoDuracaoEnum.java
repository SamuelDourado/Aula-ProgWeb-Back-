package br.edu.unievangelica.core.enums;

public enum TipoDuracaoEnum {
	
	/* ANOS */
	ANOS("anos"),
	
	/* MESES */
	MESES("meses");
	
	public String nome;

	TipoDuracaoEnum(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
