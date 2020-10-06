package com.technocorp.oop;

public class SuperClasse {

    //Declaração e inicialização dos atributos.
    private String atributoStringSuperClasse = "";
    private int atributoIntSuperClasse = 0;
    private String stringRecebeAtributos = "";

    //Construtor padrão caso haja a necessidade de instanciar um objeto sem a necessidade de inicializar os atributos.
    public SuperClasse(){

    }

    //Construtor para a inicialização dos atributos.
    public SuperClasse(String atributoStringSuperClasse, int atributoIntSuperClasse){
        this.atributoStringSuperClasse = atributoStringSuperClasse;
        this.atributoIntSuperClasse = atributoIntSuperClasse;
    }

    //Método Original.
    public String mostrarAtributos(){
        return atributoStringSuperClasse + atributoIntSuperClasse;
    }

    //Getter e Setter para manipulação do atributo fora do construtor.
    public String getStringRecebeAtributos() {
        return stringRecebeAtributos;
    }

    public void setStringRecebeAtributos(String stringRecebeAtributos) {
        this.stringRecebeAtributos = stringRecebeAtributos;
    }
}
