package com.technocorp.controleacesso.package2;

import com.technocorp.controleacesso.package1.Interativa;

public class OutroPacote {

    Interativa acesso = new Interativa();

    public void modificarIdDefault(int id){
        //Não e possivel acessar o idDefault diretamente de outro pacote, somente se houver um metodo get.
        System.out.println( "Setando idDefault de outro pacote, porém com método setIdDefault.");
        acesso.setIdDefault(id);
        System.out.println("Mostrando valor do idDefault com método get: "+acesso.getIdDefault());
    }
    public void modificarIdProtected(int id){
        System.out.println("Somente é possível alterar o atributo através do método set.");
        acesso.setIdProtected(id);
        System.out.println("Mostrando idProtected através do método get: "+acesso.getIdProtected());
    }

    public void modificarIdPublic(int id){
        System.out.println("Setando idPublic diretamente no mesmo pacote.");
        acesso.idPublic = id;
        System.out.println("Mostrando idPublic diretamente: "+ acesso.idPublic);
    }

}
