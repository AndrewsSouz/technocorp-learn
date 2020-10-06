package com.technocorp.controleacesso.package1;

public class ControleAcessos {

    //Declaracao dos atributos
    private static int id = 0;  //Atributo só acessa da mesma classe e eh global
    int idDefault = 0;  //Atributo só pode ser acessado do mesmo pacote
    protected int idProtected = 0;  //Atributo acessa de outro pacote somente por heranca
    public int idPublic = 0;    //Atributo pode ser acessado de qualquer lugar da aplicacao

    //Construtor sem argumentos
    public ControleAcessos(){

    }

    //Construtor para os atributos nao staticos
    public ControleAcessos(int idDefault, int idProtected, int idPublic){
        this.idDefault = idDefault;
        this.idProtected = idProtected;
        this.idPublic = idPublic;
    }


    //Getter e Setter para o atributo static private
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdDefault() {
        return idDefault;
    }

    public void setIdDefault(int idDefault) {
        this.idDefault = idDefault;
    }

    public void setIdProtected(int idProtected) {
        this.idProtected = idProtected;
    }

    public int getIdPublic() {
        return idPublic;
    }

    public void setIdPublic(int idPublic) {
        this.idPublic = idPublic;
    }

    public int getIdProtected(){
        return idProtected;
    }
}
