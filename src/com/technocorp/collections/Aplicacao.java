package com.technocorp.collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Aplicacao {

    public static void main(String[] args) {
        TesteList lists = new TesteList();
        TesteSet sets = new TesteSet();
        TesteMap maps = new TesteMap();

        //Listas
        System.out.println("\nPreenchendo listas e mostrando tempo de execução");
        System.out.println("preenchendo Arraylist");
        lists.preencherArrayList();
        System.out.println("preenchendo LinkedList");
        lists.preencherLinkedList();

        //Sets
        System.out.println("\nPreenchendo sets e mostrando tempo de execução");
        System.out.println("preenchendo HashSet");
        sets.preencherHashSet();
        System.out.println("preenchendo LinkedHashSet");
        sets.preencherLinkedHashSet();
        System.out.println("preenchendo TreeSet");
        sets.preencherTreeSet();
        System.out.println("\n");

        //Filas implementadas no main para mais fácil demonstração
        Queue<String> fila = new LinkedList();
        Deque<String> duasPontas = new LinkedList();
        //Queue
        System.out.println("Manuseio básico de filas");
        System.out.println("Queue");
        fila.add("Elemento 1");
        fila.add("Elemento 2");
        fila.add("Elemento 3");
        fila.add("Elemento 4");
        System.out.println(fila);
        System.out.println("Removido: "+fila.poll());
        System.out.println("Removido: "+fila.poll());
        fila.add("Novo elemento");
        System.out.println(fila);
        //Deque
        System.out.println("\nDeque");
        duasPontas.add("1");
        duasPontas.add("1");
        duasPontas.add("1");
        duasPontas.add("1");
        duasPontas.addFirst("2");
        duasPontas.addFirst("2");
        duasPontas.addLast("3");
        duasPontas.addLast("3");
        System.out.println(duasPontas);
        System.out.println("Removendo um elemento de cada ponta");
        System.out.println(duasPontas.pollFirst());
        System.out.println(duasPontas.pollLast());
        System.out.println(duasPontas);

        //Maps
        System.out.println("\nPreenchendo maps com os mesmos valores e mostrando o tempo de execução.\n");
        System.out.println("Preenchendo HashMap");
        maps.preencherHashMap();
        System.out.println("Preenchendo LinkedHashMap");
        maps.preencherLinkedHashMap();
        System.out.println("Preenchendo TreeMap");
        maps.preencherTreeMap();



    }

}
