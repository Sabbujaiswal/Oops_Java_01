package com.CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    /*
    This have working functionality as first in first out(fifo).
     */
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.offer(5);
        q.offer(6);
        q.offer(7);
        q.offer(8);
        System.out.println(q);
        System.out.println(q.peek()); //this will so kon sa element pehle bahar niklega
        System.out.println(q.poll());//remove the element
        System.out.println(q);
        //iterating---
        while (!q.isEmpty()){
            System.out.println(q.poll());
        }
        System.out.println(q.poll()); //this will trow null because element is not there
        System.out.println(q.remove()); //this method will through exception when we are try to remove element even element is no there so can use poll.

    }

}
