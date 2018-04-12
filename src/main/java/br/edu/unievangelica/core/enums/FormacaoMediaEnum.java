package br.edu.unievangelica.core.enums;

public enum FormacaoMediaEnum {

	/* ESTADO CIVIL -> SOLTEIRO(A) */
	MEDIO("mensagem.medio"),

	/* ESTADO CIVIL -> CASADO(A) */
	TECNICO("mensagem.tecnico"),

	/* ESTADO CIVIL -> DIVORCIADO(A) */
	SUPERIOR("mensagem.superior"),

	/* ESTADO CIVIL -> VIUVO(A) */
	POSGRADUACAO("mensagem.posGraduado"),

	/* ESTADO CIVIL -> OUTRO(A) */
	MESTRADO("mensagem.mestrado"),

	/* ESTADO CIVIL -> OUTRO(A) */
	DOUTORADO("mensagem.doutorado"),

	/* ESTADO CIVIL -> OUTRO(A) */
	POSDOUTORADO("mensagem.posDoutorado");

	public String nome;

	FormacaoMediaEnum(String nome) {
		this.nome= nome;
	}

	public String getNome() {
		return nome;
	}
}
