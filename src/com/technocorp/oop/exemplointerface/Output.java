package com.technocorp.oop.exemplointerface;

import com.technocorp.oop.exemplointerface.exeptions.OutOfScopeException;

//Classe para mostrar na tela os retornos dos métodos.
public class Output {

    Brasil rs = new RioGrandeDoSul();
    Brasil sc = new SantaCatarina();

    public void mostraImpostos(int op,Double valor){
        try {
            if (op == 1) {
                System.out.println("Valor = " + valor + " Imposto = " + Math.round(rs.calcularIcmsEIpi(valor) * 100.0) / 100.0);
            } else if (op == 2) {
                System.out.println("Valor = " + valor + " Imposto = " + Math.round(sc.calcularIcmsEIpi(valor) * 100.0) / 100.0);
            } else {
                throw new OutOfScopeException("A op informada não existe = "+op);
            }
        }catch(OutOfScopeException e){
            System.err.println(e);
        }
    }
}
