package com.Oops01;

public class OverridingLearn {
    public static void main(String[] args) {
   Parent pr=new Parent();
   pr.Beat("jack");
   pr.show();

   /*
    If a Parent type reference refers to a Child object Child's show()
       is called. This is called RUN TIME POLYMORPHISM.
    */
        Parent pr2=new Child();
        pr2.show();
        pr2.Beat("Mack");
        Child ch=new Child();

    }
}
//Added this project on gitHub.
//super key word user to refer parents class properties
// (super key use to instance the method and constructor of parent class)
/*
Oops 4 pillers-Abstraction, encapsulation, polymorphism, and inheritance
Polymorphism- it is two types
 (i) Compile Time polymorphism(we can achieve compile time polymorphism by method overloading).
(ii)Run time polymorphism(we can achieve Run time polymorphism by method Overriding)

Method Overriding-a.same method, b. Different class ,c. same arguments, d.Inheritance
 */
class Parent{
    //constructor
    Parent(){
        System.out.println("This is a constructor of Parents class");
    }
    Parent(String name){
        System.out.println("This is constructor of parent class with parameter");
    }
    void show(){
        System.out.println("Parent's show()");

    }
    void Beat(String name){
        System.out.println(name+" is beaten by parents");
    }

}
class Child extends Parent {
    @Override
    void show() {
        System.out.println("This is child show()");
        super.show();
        super.Beat("Parent");
    }

    @Override
    void Beat(String name) {
        System.out.println("Child beaten");
    }
    Child(){
        super("Ram");//agar isko comment kr denge to bydefault unparameterised constructor h wo call hoga h kyu k uske properties ko inherite kie h and jb object child ka bnega to default call ho jaega
        System.out.println("This is a child constructor");
    }
}
