package com.test.java01;

public class MethodOverloading {
    public static void main(String[] args) {
Greet gr=new Greet();
gr.greetings();
gr.greetings("jack");
gr.greetings("Sabbu",3);
    }
}

//the function name should be same but arguments passed in that function should be same
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