package com.technocorp.oop.exemplointerface;

import com.technocorp.oop.exemplointerface.exceptions.OutOfScopeException;

public class RioGrandeDoSul implements Brasil{

    //sobreescrevendo os dois métodos.
    @Override
    public Double calculaIpi(Double valor) {
        Double valorDoIpi = valor * 0.1;
        return valorDoIpi;
    }
    //Calcula 9% de Icms para o RS e chama o retorno do método calculaIpi que é 10% do parametro passado.
    //Retorna um Double com a soma dos dois impostos.
    @Override
    public Double calcularIcmsEIpi(Double valor) throws OutOfScopeException {
        Double valorDoIcms = valor * 0.09;
        return calculaIpi(valor) + valorDoIcms;
    }




}
