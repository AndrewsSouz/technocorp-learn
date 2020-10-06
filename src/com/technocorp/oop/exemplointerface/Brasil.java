package com.technocorp.oop.exemplointerface;

import com.technocorp.oop.exemplointerface.exceptions.OutOfScopeException;

public interface Brasil {

    //Método obrigatório em todas as classes que implementam a interface, somente a assinatura.
    public Double calcularIcmsEIpi(Double valor) throws OutOfScopeException;

    //Método default implementado à partir do Java 8, não é obrigatório nas classes que implementam.
    //Pode ser acessado atráves de um objeto que implementa a Interface sem estar sobreescrito.

    default public Double calculaIpi(Double valor){
        valor += valor * 0.1;
        return valor;
    }

}
