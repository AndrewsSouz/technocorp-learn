package com.technocorp.oop.exemplointerface;

import com.technocorp.oop.exemplointerface.exceptions.OutOfScopeException;

public class SantaCatarina implements Brasil{
    //Não é preciso implementar o método default.
    /*@Override
    public Double calculaIpi(Double valor) {
        Double valorDoIpi = valor * 0.1;
        return valorDoIpi;
    }*/

    //Método obrigatório com comportamento diferente da classe que implementa.
    @Override
    public Double calcularIcmsEIpi(Double valor) throws OutOfScopeException {
        Double valorDoIcms = valor * 0.03;
        return valorDoIcms;
    }

}
