package com.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class CollectionInterface {
    /*
 Java Collection Framework-->Java Collection framework provide a set of interfaces and classes to implement various data
 structure and algorithms.
 The interfaces include several method to perform different operations on collections.
 Java Collection Interface-->The Collection interface is the root interface of the java collection framework.
 ArrayList ,LinkedList,Stack,Vector  there are classes which implements List(interface) and List Implements Collection.
  Collection have various method we will use in these classes because they are implemented.

     */
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1);
        System.out.println(list);
        System.out.println(list.contains(30));
       // list.clear();
       // System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove(Integer.valueOf(1));
        System.out.println(list);
        List<Integer> list2=new ArrayList<>();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        System.out.println(list2);
        list2.addAll(list);
        System.out.println(list2);
        list2.retainAll(list);//use for intersection of list will give common value which contains both
        System.out.println(list2);
        System.out.println(list2.get(0));
        list2.add(1,90);
        System.out.println(list2);
        list2.set(0,50);
        System.out.println(list2);
        list2.add(30);
        System.out.println(list2);
        list2.add(2,55);
        System.out.println(list2);
        System.out.println(list2.indexOf(55));
    }
}
