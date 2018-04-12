package br.edu.unievangelica.core.enums;

public enum TipoMensagemEnum {

	/* TIPO DE MENSAGEM DE INFORMAÇÃO */
	INFORMACAO("notification-info", "fa fa-info"), 
	
	/* TIPO DE MENSAGEM DE SUCESSO */
	SUCESSO("notification-success", "fa fa-check"),
	
	/* TIPO DE MENSAGEM DE ERRO */
	ERRO("notification-danger", "fa fa-remove"), 
	
	/* TIPO DE MENSAGEM DE ALERTA */
	ALERTA("notification-warning", "fa fa-warning");

	public String estilo;
	public String icone;

	private TipoMensagemEnum(String estilo, String icone) {
		this.estilo = estilo;
		this.icone = icone;
	}

	public String getEstilo() {
		return estilo;
	}

	public String getIcone() {
		return icone;
	}

}
