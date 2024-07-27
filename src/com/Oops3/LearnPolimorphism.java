package com.Oops3;

public class LearnPolimorphism {
    /*
    Java Polymorphism-polymorphism allows us to perform a single action in a different way.
    There are two types of polymorphism(i)Compile time polymorphism (ii) Run time polymorphism

    *********************
    Java Heap Memory-Java Heap space is used by java runtime to Allocate memory to Object and JRE classes.
    2.Any object created in heap space has global access and can be referenced from anywhere of the application.
    Java Stack Memory- Java stack memory contains method-specific values that are short lived
    and references to other object in the heap that getting referred from the method.
    stack memory size is very less compare to heap
    //see interview question of heap and stack memory
     */
    public static void main(String[] args) {
        Data d=new childData();//run time polymorphism that is also known as overriding
        d.fun(1);
        Data d2=new Data();//Compile time polymorphism also known as overloading
        d2.fun(5);
        d2.fun(2,3);
        d2.fun(4,"K","L");
    }
}

class Data{
    void fun(int a){
        System.out.println("Laughing 1");
    }
    void fun(int a ,int b){
        System.out.println("laughing 2");
    }
    void fun(int a,String e,String d){
        System.out.println("Laughing 3");
    }
}

class childData extends Data{
    @Override
    void fun(int a) {
        System.out.println("Laughing in child");
    }
}