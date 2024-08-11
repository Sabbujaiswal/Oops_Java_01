package com.CollectionFramework;

import java.util.*;

public class LearnMap {
    /*
    Map Interface--> In Java, elements of Map store in key/value pairs. key are unique values associated with individual values.
    A map can not contain duplicate keys.And each key is associated with a single value.
    Values can be same but key can not.
     */
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Ram");
        map.put(3,"Raman");
        map.put(5,"Ravan");
        map.put(7,"Ram");
        map.put(1,"Ram");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey(1));
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.remove(5,"Ravan"));
        System.out.println(map);
        System.out.println(map.getOrDefault(2,"Rocky"));
        System.out.println(map.getOrDefault(1,"RRR"));//agar key ni rhega tb default value dega other wise ni
        Set<Integer> keys=map.keySet();
        System.out.println(keys);
        Collection<String> values=map.values();
        System.out.println(values);
        for(int key:keys){
            System.out.println(key);
        }
        for (String value:values){
            System.out.println(value);
        }
    }
}
