package com.CollectionFramework;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnDequeue {
    //Dono side se element add and remove kr skte ho
    public static void main(String[] args) {
        ArrayDeque<Integer> arr=new ArrayDeque<>();
        arr.offer(10);
        arr.offerFirst(30);
        arr.offerLast(50);
        System.out.println(arr);
        System.out.println(arr.poll());
        System.out.println(arr);
        System.out.println(arr.pollLast());

        Queue<Integer> prQ=new PriorityQueue<>();
        prQ.add(30);
        prQ.add(10);
        prQ.add(40);
        prQ.add(70);
        prQ.add(50);
        System.out.println("Priority que is--"+ prQ);  //add pichhe se add krta h
        System.out.println(prQ.poll());//priority number k basis pe nikalega like small first and so on
        System.out.println(prQ);
        System.out.println(prQ.poll());
        System.out.println(prQ);
        System.out.println(prQ.peek());
    }
}
