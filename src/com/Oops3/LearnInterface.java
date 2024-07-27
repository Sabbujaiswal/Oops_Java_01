package com.Oops3;

public class LearnInterface {
    /*
    Interface-->1.A interface is a fully abstract class. it includes a group of abstract method(Method without a body)
    2.We use Interface key word to create an Interface in Java.
    3.Like Abstract class we can create object of Interface.
    4. To use Interface other class must implement it . we use implement keyword to implement an interface.
    5. measure differance in interface is we can use multiple interface its mean one class can implement two interfaces.
    6.interface ke andar by default abstract method k pehle lga hota h no need to declare it.
    and method v isme by default public hota h kyu k private krne ka koi meaning h ni kyu hmko iski
    properties or method ko dusre class m access krna hota h
    imp--> interface k ander by default public static final variable hota h agr ni v lgaenge to default wo waha pe rehata h.
    so value unchangble hi hota h
    7-default key word ka use krke concrete method v bna skte h.
     */
    public static void main(String[] args) {
        System.out.println("Learning Interface... and checking difference b/w Abstract & Interface class.. ");
        Monkey mn= new Monkey();
        mn.play();
        mn.run();
        mn.game();
        System.out.println("Ag is "+Animal.age);
        Animal.sing();

    }
}

interface Animal {
    void run();
void play();
    //public static final int age = 30; or
    int age=30;
    public static void sing() {
        System.out.println("This is interface with static method..");
    }
}

interface Human{
    void play();
    default void game(){
        System.out.println("this is a concrete method in interface..");
    }
}

class Monkey implements Animal,Human{

    @Override
    public void run() {
        System.out.println("Monkey is running..");
    }

    @Override
    public void play() {
        System.out.println("this is play method which is in both interface so multiple interface allowed ");
    }
}