package br.edu.unievangelica.core.enums;

public enum MensagemEnum {

	/* MENSAGENS DE SUCESSO AO CADASTRAR */
	MENSAGEM_SUCESSO_CADASTRAR("mensagem.sucesso.cadastrar"),

	/* MENSAGENS DE ERRO AO CADASTRAR */
	MENSAGEM_ERRO_CADASTRAR("mensagem.erro.cadastrar"),
	
	/* MENSAGENS DE SUCESSO AO CADASTRAR */
	MENSAGEM_SUCESSO_ALTERAR("mensagem.sucesso.alterar"),

	/* MENSAGENS DE SUCESSO AO EXCLUIR */
	MENSAGEM_SUCESSO_EXCLUIR("mensagem.sucesso.excluir"),

	/* MENSAGENS DE SUCESSO AO ATIVAR */
	MENSAGEM_SUCESSO_ATIVAR("mensagem.sucesso.ativar"),

	/* MENSAGENS DE SUCESSO AO INATIVAR */
	MENSAGEM_SUCESSO_INATIVAR("mensagem.sucesso.inativar"),

	/* MENSAGENS DE REGISTRO NÃO ENCONTRADO */
	MENSAGEM_REGISTRO_INEXISTENTE("mensagem.validacao.registro.inexistente"),

	/* MENSAGENS DE REGISTRO JÁ CADASTRADO */
	MENSAGEM_REGISTRO_EXISTENTE("mensagem.validacao.registro.existente"),
	
	/* MENSAGENS DE ERRO NÃO PODE EXCLUIR */
	MENSAGEM_ERRO_EXCLUIR("mensagem.erro.excluir"),

	/* MENSAGENS DE ERRO NÃO PODE EXCLUIR */
	MENSAGEM_ERRO_VINCULO("mensagem.erro.vinculo"),

	MENSAGEM_ERRO_FORMULARIO("mensagem.erro.formulario"),

	/* MENSAGENS DE ERRO NÃO PODE INATIVAR */
	MENSAGEM_ERRO_INATIVAR("mensagem.erro.inativar"),

	/* MENSAGENS DE JÁ POSSUI PAGAMENTO REALIZADO PARA COBRANCA */
	MENSAGEM_JA_EXISTE_PAGAMENTOS("mensagem.erro.excluir.serie.divida.cobranca"),

	/* MENSAGENS DE ERRO NÃO PODE BURLAR O SISTEMA */
	MENSAGEM_ERRO_BURLAR_SISTEMA("mensagem.erro.burlarSistema"),
	/* MENSAGENS DE SUCESSO AO GERAR PAGAMENTO */
	MENSAGEM_SUCESSO_GERAR_PAGAMENTO("mensagem.sucesso.gerar.pagamento"),

	/* MENSAGENS DE ERRO SESSAO DE PAGAMENTO EXPIRADA */
	MENSAGEM_ERRO_SESSAO_PAGAMENTO_EXPIRADA("mensagem.erro.sessao.pagamento.expirada");

	public String mensagem;

	MensagemEnum(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}

}
