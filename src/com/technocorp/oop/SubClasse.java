package com.technocorp.oop;

public class SubClasse extends SuperClasse{

    //Construtor da subclasse referenciando os atributos da superclasse.
    public SubClasse(String atributoStringSuperClasse, int atributoIntSuperClasse) {
        super(atributoStringSuperClasse, atributoIntSuperClasse);
    }

    //Instanciando objeto do tipo SuperClasse
    SuperClasse objetoSuperClasse = new SuperClasse();

    //Método sobreescrito com comportamento diferente.
    @Override
    public String mostrarAtributos() {
        objetoSuperClasse.setStringRecebeAtributos(super.mostrarAtributos());
        return objetoSuperClasse.getStringRecebeAtributos();
    }

}
