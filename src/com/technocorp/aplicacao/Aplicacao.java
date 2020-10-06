package com.technocorp.aplicacao;

import com.technocorp.controleacesso.package1.Interativa;
import com.technocorp.controleacesso.package2.OutroPacote;
import com.technocorp.controleacesso.package2.SubclasseOutroPacote;
import com.technocorp.oop.SubClasse;

public class Aplicacao {

    public static void main(String[] args) {

        Interativa interativa = new Interativa();
        OutroPacote outroPacote = new OutroPacote();
        SubclasseOutroPacote subclasseOutroPacote = new SubclasseOutroPacote();

        //Mostrando testes variável global
        System.out.println("Testes variável global:\n\n" +
                "Objeto 1:");
        interativa.modicarIdStaticObAcesso(20);
        interativa.mostrarIdStatic();
        System.out.println("--------\n" +
                "Objeto 2:");
        interativa.modicarIdStaticObTesteAcesso(40);
        interativa.mostrarIdStatic();
        System.out.println("======================");

        //Mostrando testes modificador acesso default
        System.out.println("Testes para atributo com modificador default:\n\n" +
                "Objeto no mesmo pacote:");
        interativa.modificarIdDefault(10);
        System.out.println("-------\n" +
                "Objeto em pacote diferente:");
        outroPacote.modificarIdDefault(30);
        System.out.println("======================");

        //Mostrando testes modificador de acesso protected
        System.out.println("Testes para atributo com modificador protected:\n\n" +
                "Objeto em outro pacote se ser subclasse: ");
        outroPacote.modificarIdProtected(2);
        System.out.println("-------\n" +
                "Subclasse em outro pacote: ");
        subclasseOutroPacote.modificarIdProtected();
        System.out.println("======================");

        //Mostrando testes modificador de acesso público
        System.out.println("Testes para atributo com modificador publico:\n\n" +
                "Objeto no mesmo pacote: ");
        interativa.modificarIdPublic(10);
        System.out.println("-------\n" +
                "Outro pacote: ");
        outroPacote.modificarIdPublic(20);






    }



}
