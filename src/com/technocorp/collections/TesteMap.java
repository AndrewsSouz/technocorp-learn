package com.technocorp.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TesteMap {

    private Map<Integer,String> hashMap = new HashMap();
    private Map<Integer,String> linkedHashMap = new LinkedHashMap();
    private Map<Integer,String> treeMap = new TreeMap();

    public void preencherHashMap(){
        long start = System.nanoTime();
        for (int i = 0;i<5000;i++){
           hashMap.put(i,"123");
        }
        long tFinal = System.nanoTime();
        System.out.println((tFinal - start)/1000);
    }

    public void preencherLinkedHashMap(){
        long start = System.nanoTime();
        for (int i = 0;i<5000;i++){
            linkedHashMap.put(i,"123");
        }
        long tFinal = System.nanoTime();
        System.out.println((tFinal - start)/1000);
    }

    public void preencherTreeMap(){
        long start = System.nanoTime();
        for (int i = 0;i<5000;i++){
            treeMap.put(i,"123");
        }
        long tFinal = System.nanoTime();
        System.out.println((tFinal - start)/1000);
    }
}
