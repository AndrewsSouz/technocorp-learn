package com.technocorp.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteSet {

    private Set hashSet = new HashSet();
    private Set linkedHashSet = new LinkedHashSet();
    private Set treeSet = new TreeSet();

    public void preencherHashSet(){
        long start = System.nanoTime();
        for (int i = 0;i<5000;i++){
            hashSet.add(i);
        }
        long tFinal = System.nanoTime();
        System.out.println((tFinal - start)/1000);
    }

    public void preencherLinkedHashSet(){
        long start = System.nanoTime();
        for (int i = 0;i<5000;i++){
            linkedHashSet.add(i);
        }
        long tFinal = System.nanoTime();
        System.out.println((tFinal - start)/1000);
    }

    public void preencherTreeSet(){
        long start = System.nanoTime();
        for (int i = 0;i<5000;i++){
            treeSet.add(i);
        }
        long tFinal = System.nanoTime();
        System.out.println((tFinal - start)/1000);
    }


}
