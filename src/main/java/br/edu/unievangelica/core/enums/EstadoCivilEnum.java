package br.edu.unievangelica.core.enums;

public enum EstadoCivilEnum {

	/* ESTADO CIVIL -> SOLTEIRO */
	SOLTEIRO("mensagem.solteiro"),
	
	/* ESTADO CIVIL -> CASADO */
	CASADO("mensagem.casado"),
	
	/* ESTADO CIVIL -> DIVORCIADO */
	DIVORCIADO("mensagem.divorciado"),
	
	/* ESTADO CIVIL -> VIUVO */
	VIUVO("mensagem.viuvo"),
	
	/* ESTADO CIVIL -> OUTRO */
	OUTRO("mensagem.outro");
	
	public String nome;
	
	EstadoCivilEnum(String nome) {
		this.nome= nome;
	}
}
