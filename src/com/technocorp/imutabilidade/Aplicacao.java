package com.technocorp.imutabilidade;

public class Aplicacao {
    public static void main(String[] args) {
        Imutavel im = new Imutavel("Andrews ");

        System.out.println(im.getAtributoImutavel());
        System.out.println(im.transformaAtributo("Souza"));
        System.out.println(im.getAtributoImutavel());
    }
}
