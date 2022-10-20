package com.example.homework_teachmeskills;

import java.util.HashMap;
import java.util.TreeMap;

public class Mapa_ {
    public static void main(String[] args) {
        HashMap hashMap1 = new HashMap();
        hashMap1.put("planet","earth");
        hashMap1.put("earth","country");
        hashMap1.put("animal", "cat");
        hashMap1.put("earth","ocean");// заменил прошлый

        System.out.println(hashMap1);
        System.out.println(hashMap1.get("animal"));
        hashMap1.remove("animal");
        System.out.println(hashMap1);
        System.out.println(hashMap1.keySet());
        System.out.println(hashMap1.containsValue("cat"));
        System.out.println(hashMap1.values());


        TreeMap treeMap=new TreeMap();
        treeMap.put("a","p");
        treeMap.put("k","k");
        treeMap.put("c","o");
        System.out.println(treeMap);


    }



}
