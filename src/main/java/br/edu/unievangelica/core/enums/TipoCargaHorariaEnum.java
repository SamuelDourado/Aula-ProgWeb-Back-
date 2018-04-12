package br.edu.unievangelica.core.enums;

public enum TipoCargaHorariaEnum {
	
	/* HORAS */
	HORAS("horas"), 
	
	/* MINUTOS */
	MINUTOS("minutos");
	
	public String nome;

	TipoCargaHorariaEnum(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
