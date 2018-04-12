package br.edu.unievangelica.core.enums;

public enum RegimeEnum {
	
	/* SEMESTRAL */
	SEMESTRAL("semestral"),
	
	/* ANUAL */
	ANUAL("anual");
	
	public String nome;

	RegimeEnum(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
