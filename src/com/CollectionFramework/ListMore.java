package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class ListMore {
    /*
    ArrayList-->In Java ,we need to declare the size of the array before we can use it. once the size of an array declare hard to change it.
 To handle this issue we can use the arrayList class.it allows us to create resizable array.
 arrayList is also known as dynamic in arrays.

 LinkedList--->Element in LinkedList is not store in a sequence , instead they are scattered and connected through links.(will learn LinkedList More about it.)
 Vector class->The vector class synchronize each individual operation. this means whenever we want to perform some
 operation on vector , the vector class automatically applies lock to that operation.(see some interview question on it not much important)

 Java Stack-->In stack, element are stored and accessed in Last in first out(LIFO) manner.
 stack class also implements List so we can use List methods and stack class have there own some method we can use it.
 eg-pop(),peek(),empty().
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

       List<Integer> l1=new Stack<>();
       l1.add(2);
       l1.add(4);
        l1.add(5);
        System.out.println(l1);
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.empty());

    }
}
