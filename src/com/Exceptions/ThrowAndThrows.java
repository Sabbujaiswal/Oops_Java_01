package com.Exceptions;

import java.util.Scanner;

public class ThrowAndThrows {
    /*
    We use throws keyword in the method declaration to declare the type of exception that might occur within it.
    throws key kam aata h btane ke k this function might through exception.

    throw--> throw key word used to explicitly throw a single exception.
    we can throw custom exception by using throw key word.
     */

    public static void main(String[] args) {
        int a[] =new int[9];
        try {
            System.out.println(meth1(a));

        }catch (Exception e){
            System.out.println("Exception Handled");
        }

        Scanner sc =new Scanner(System.in);
        System.out.println("Entre the age...");
        int age= sc.nextInt();
        try{
            if(age>100){
                throw new RuntimeException("Plz enter age less then 100");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

     //divideNUm(10,0);
        int arr[]=new int[12];
meth1(arr);

    }

    public  static int divideNUm(int a ,int b) throws ArithmeticException{
        try {
            if(b==0){
                throw new ArithmeticException("Can Not be Divided by a zero..");
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        return a/b;
    }
    public  static int meth1(int a[]) throws ArrayIndexOutOfBoundsException{
        return a[10];
    }
}

