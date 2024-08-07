package com.CollectionFramework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSets {
    /*
Java set interface-->The set interface of the java collection framework provide the feature of the mathematical set in java.
 Its extends the Collection Interface.
 Unlike the List interface , set can not contain duplicate elements.
 EnumSet,HashSet,LinkedHashSet ,treeSet these are classes which implement Set interface.
 Duplicate value not allowed in set.
 elements will be in random order in set.
 O(1)--bigo of one constant time m sare operation hote h set m
     */
    public static void main(String[] args) {
        Set<Integer> st=new HashSet<>();
        st.add(10);
        st.add(10);
        st.add(60);
        st.add(50);
        st.add(10);
        st.add(20);
        System.out.println(st);
        System.out.println(st.remove(10));
        System.out.println(st);

        Set<Integer> st1= new TreeSet<>();
        st1.add(4);
        st1.add(3);
        st1.add(1);
        st1.add(6);
        st1.add(2);
        System.out.println("Isme sorted order m element store hote h--"+st1);
    }
}

