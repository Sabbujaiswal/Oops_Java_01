package com.Exceptions;

public class finallyBlock {
    /*
    Exception is a parent class of all the exceptions.
    finally block--> in java we use finally block after try and catch block.
    finally block will always executed whether there is an exception inside the try block or not.
    it is good practice to use finally block to include important clean up code.

    Note finally block can be used with try block also if there is no catch block.
    some cases where finally block does not execute-System.exit() method an exception occurred in the finally block.
     */
    public static void main(String[] args) {
        int ar[]=new int[5];
        System.out.println("Hello finally...");
try{
    System.out.println(ar[10]);
}catch (Exception e){
    System.out.println("Exception handled ");
   // System.exit(1);
} finally {
    System.out.println("I will always execute");
}
        System.out.println("checking.....");
try{
    int num=5/0;
}finally {
    System.out.println("Does not matter there is exception or not");
}
        System.out.println("After everything..");
    }
}
