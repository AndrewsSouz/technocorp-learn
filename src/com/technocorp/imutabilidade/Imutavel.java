package com.technocorp.imutabilidade;

public final class  Imutavel {

    private final String atributoImutavel;

    public Imutavel(String atributoImutavel) {
        this.atributoImutavel = atributoImutavel;
    }

    public final String getAtributoImutavel() {
        return atributoImutavel;
    }

    String transformaAtributo(String parametro){
        String retorno = this.atributoImutavel + parametro;
        return retorno;
    }
}
