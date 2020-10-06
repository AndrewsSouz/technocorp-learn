package com.technocorp.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteList {

    private List<Integer> al = new ArrayList();
    private List<Integer> ll = new LinkedList();

    public void preencherArrayList(){
        long start = System.nanoTime();
        for (int i = 0;i<5000;i++){
            al.add(i);
        }
        long tFinal = System.nanoTime();
        System.out.println((tFinal - start)/1000);
    }

    public void preencherLinkedList(){
        long start = System.nanoTime();
        for (int i = 0;i<5000;i++){
            ll.add(i);
        }
        long tFinal = System.nanoTime();
        System.out.println((tFinal - start)/1000);
    }

}
