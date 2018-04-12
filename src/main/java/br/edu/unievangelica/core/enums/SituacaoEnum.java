package br.edu.unievangelica.core.enums;

public enum SituacaoEnum {

	/* SITUAÇÃO INATIVO */
	INATIVO("inativo"), 
			
	/* SITUAÇÃO ATIVO */
	ATIVO("ativo");
		
	public String nome;

	SituacaoEnum(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

}
