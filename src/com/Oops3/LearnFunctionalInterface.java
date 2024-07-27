package com.Oops3;

public class LearnFunctionalInterface {
    /*
    Functional Interface-->
    1. An interface that contains exactly one abstract method is known as functional interface .(Means only one method allowed)
    2.Functional interface introduce in java8 , allow us to use lambda expression to initiate the interface method
    and avoid using lengthy codes for anonymous class implementation.
    2-Lambda expression sirf functional interface par hi kam krta h kyu k usme sirf ek hi method hota h
    3.Lambda expression make the function short.

     */
    public static void main(String[] args) {
        Walk wk=(steps)->{
            System.out.println("walk with "+steps+ " steps to reach destination .");
        };
        wk.walkable(100);
    }
}
@FunctionalInterface
interface Walk{
    void walkable(int steps);
}