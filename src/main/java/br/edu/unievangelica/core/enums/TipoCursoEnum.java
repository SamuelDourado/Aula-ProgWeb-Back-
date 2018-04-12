package br.edu.unievangelica.core.enums;

public enum TipoCursoEnum {

    /* TÉCNICO */
    TECNICO("mensagem.tecnico"),

    /* LICENCIATURA */
    LICENCIATURA("mensagem.licenciatura"),

    /* BACHARELADO */
    BACHARELADO("mensagem.bacharelado"),

    /* ESPECIALIZAÇÃO */
    ESPECIALIZACAO("mensagem.especializacao"),

    /* MESTRADO */
    MESTRADO("mensagem.mestrado"),

    /* DOUTORADO */
    DOUTORADO("mensagem.doutorado"),

    /* OUTROS */
    OUTROS("mensagem.outros");

    public String nome;

    TipoCursoEnum(String nome) {
        this.nome = nome;
    }

	public String getNome() {
		return nome;
	}

	public static TipoCursoEnum tipoCursoToString(int tipoCurso){
		for(TipoCursoEnum tipo : TipoCursoEnum.values()){
			if(tipo.ordinal() == tipoCurso){
				return tipo;
			}
		}
		return TipoCursoEnum.OUTROS;
	}

}
