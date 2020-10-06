package com.technocorp.oop;

import com.technocorp.oop.exemplointerface.Output;

public class Aplicacao {

    int atributoN = 0;


    public static void main(String[] args) {
        //Instanciando os objetos
        SuperClasse objetoSuperClasse = new SuperClasse("Valor: ",3000);
        SubClasse objetoSubClasse = new SubClasse("Valor :", 5000);

        //Polimorfismo.
        System.out.println("\nMétodo na SuperClasse que retorna os dois atributos:\n"
                +objetoSubClasse.mostrarAtributos());
        System.out.println("Método na SubClasse que junta os atributos em outra variável antes de mostrar:\n"
                +objetoSuperClasse.mostrarAtributos());

        //Comportamento com interfaces.
        System.out.println("=============================\n");
        System.out.println("Comportamento com Interfaces:");
        Output output = new Output();
        //Passa uma opção de escolha e dependendo dessa opção o programa decide qual método irá usar.
        System.out.println("op = 1 = classe RioGrandeDoSul");
        output.mostraImpostos(1,1537.78);
        System.out.println("\nop = 2 = Classe SantaCatarina");
        output.mostraImpostos(2,1537.78);
        System.out.println("\nop = 3 = Não existente");
        output.mostraImpostos(3,1537.78);


        //Exemplificando acesso por valor ou referencia.
        //Na realidade o que se chama de acesso por referência também se da por valor.
        System.out.println("=============================\n");
        System.out.println("Acesso por valor ou referencia:");

        Aplicacao ob = new Aplicacao();
        int n = 0;

        System.out.println("Atributo alterado em ob = "+ ++ob.atributoN);
        Aplicacao obX1 = ob;
        System.out.println("Atributo alterado em obX1 = "+ ++obX1.atributoN);
        ob.trytochange(n,obX1);
        System.out.println("Variável dentro do Main = "+n);
        System.out.println("=============================");
        System.out.println("atributoN da classe aplicação = "+ ob.atributoN);


    }


    public void trytochange(int n, Aplicacao obX2){
        n++;
        System.out.println("Atributo alterado em obX2: "+ ++obX2.atributoN);
        System.out.println("=============================");
        System.out.println("Variável local dentro do método = "+n);
    }

}
