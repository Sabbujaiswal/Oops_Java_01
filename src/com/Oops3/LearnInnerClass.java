package com.Oops3;

public class LearnInnerClass {
    /*
    Inner class and nested static class in java-->
    1.a Non- static nested class within another class is known as inner class .
    Unlike inner class , static nested class can not access the member variable of outer class .
   2.static nested class does not require you to create an instance of the outer class.
   using the nested class make your code more readable and provide better encapsulation.
     */
     class Toy{
        int prize;
    }
 static class Game{
         String cricketer;
 }
 //object cration of inner class and achieving static class variable..
    public static void main(String[] args) {
        LearnInnerClass in=new LearnInnerClass();
        Toy ty=in.new Toy();
        ty.prize=50;
         Game gm= new LearnInnerClass.Game();
         gm.cricketer="Sachin";

    }
}
