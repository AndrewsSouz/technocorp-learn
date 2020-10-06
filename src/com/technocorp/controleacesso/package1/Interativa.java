package com.technocorp.controleacesso.package1;

public class Interativa extends ControleAcessos{

    //Dois objetos da classe ControleAcessos para teste do atributo definido como static
    //A referencia aos atributos poderia ser feita usando this. ou super, já que a classe Interativa é subclasse de ControleAcessos,
    //neste caso foram usados objetos para demonstrar o funcionamento de uma varável global.

    ControleAcessos acesso = new ControleAcessos();
    ControleAcessos testeAcesso = new ControleAcessos();

    //Método que modifica pelo objeto acesso
    public void modicarIdStaticObAcesso(int id){
        acesso.setId(id);
    }
    //Método que modifica pelo objeto testeAcesso
    public void modicarIdStaticObTesteAcesso(int id){
        testeAcesso.setId(id);
    }

    //Mostra o atributo acessando pelos dois objetos
    public void mostrarIdStatic(){
        System.out.println("Objeto acesso: "+acesso.getId());
        System.out.println("Objeto testeAcesso: "+testeAcesso.getId());
    }

    public void modificarIdDefault(int id){
        System.out.println("Setando idDefault diretamente pois é permitido de dentro do mesmo pacote.");
        acesso.idDefault = id;
        System.out.println("Mostrando valor do idDefault acessando diretamente:"+ acesso.idDefault);
    }

    public void modificarIdPublic(int id){
        System.out.println("Setando idPublic diretamente no mesmo pacote.");
        this.idPublic = id;
        System.out.println("Mostrando idPublic diretamente: "+ this.idPublic);
    }



}
