package com.Oops01;

public class MethodOverloading {
    public static void main(String[] args) {
Greet gr=new Greet();
gr.greetings();
gr.greetings("jack");
gr.greetings("Sabbu",3);
    }
}
//OverLoading--->
//the function name should be same and arguments passed in that function should be different.
// this feature known as a method overloading

class Greet{
    void greetings(){
        System.out.println("Hello ! Good Morning");
    }
    void greetings(String name){
        System.out.println("Hello "+name+" Good Morning");
    }
    void greetings(String name, int count){
        for(int i=0;i<count;i++){
            System.out.println("Hello "+name+" Good Morning ");
        }
    }
}