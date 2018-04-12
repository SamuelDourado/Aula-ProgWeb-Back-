package br.edu.unievangelica.core.enums;

public enum TipoPerfilEnum {
	
	/* FUNCIONÁRIO */
	FUNCIONARIO("mensagem.funcionario"),
	
	/* DOCENTE */
	DOCENTE("mensagem.docente"),
	
	/* ALUNO */
	ALUNO("mensagem.aluno");
	
	public String nome;

	TipoPerfilEnum(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public static TipoPerfilEnum tipoPerfilToString(int tipoPerfil){
		for(TipoPerfilEnum tipo : TipoPerfilEnum.values()){
			if(tipo.ordinal() == tipoPerfil){
				return tipo;
			}
		}
		return null;
	}
}
