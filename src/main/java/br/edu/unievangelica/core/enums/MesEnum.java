package br.edu.unievangelica.core.enums;

public enum MesEnum {
    /* JANEIRO */
    JANEIRO("Janeiro", 1),

    /* FEVEREIRO */
    FEVEREIRO("Fevereiro", 2),

    /* MARCO */
    MARCO("Marco", 3),

    /* ABRIL */
    ABRIL("Abril", 4),

    /* MAIO */
    MAIO("Maio", 5),

    /* JUNHO */
    JUNHO("Junho", 6),

    /* JULHO */
    JULHO("Julho", 7),

    /* AGOSTO */
    AGOSTO("Agosto", 8),

    /* SETEMBRO */
    SETEMBRO("Setembro", 9),

    /* OUTUBRO */
    OUTUBRO("Outubro", 10),

    /* NOVEMBRO */
    NOVEMBRO("Novembro", 11),

    /* DEZEMBRO */
    DEZEMBRO("Dezembro", 12);

    private String nome;

    private int numero;

    MesEnum(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return this.numero;
    }
}
