package br.edu.unievangelica.core.enums;

public enum SexoEnum {

	/* SEXO MASCULINO */
	MASCULINO("mensagem.masculino"),
	
	/* SEXO FEMININO */
	FEMININO("mensagem.feminino"); 
	
	public String nome;

	SexoEnum(String nome) {
		this.nome = nome;
	}

}
