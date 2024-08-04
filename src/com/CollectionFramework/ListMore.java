package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMore {
    /*
    ArrayList-->In Java ,we need to declare the size of the array before we can use it. once the size of an array declare hard to change it.
 To handle this issue we can use the arrayList class.it allows us to create resizable array.
 arrayList is also known as dynamic in arrays.

 LinkedList--->Element in LinkedList is not store in a sequence , instead they are scattered and connected through links.(will learn LinkedList More about it.)
     */
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Papaya");
        fruits.add("Banana");
        System.out.println(fruits);
        for (int i=0;i<fruits.size();i++){
            System.out.println("Iterating Fruits..."+fruits.get(i));
        }
        for(String fruit:fruits){
            System.out.println("Iterating through for each..."+fruit);
        }

        Iterator<String> fr= fruits.iterator();
       while (fr.hasNext()){
           System.out.println("Iterating through iterator..."+fr.next());
       }

    }
}
