package com.Oops3;

public class AnonymousClassLearn {
    /*
    A nested class that does not have any name is known as anonymous class .
    Anonymous classes usually extends subclass or implements interface.
    here type can be --
    a.A super class that an anonymous class extends.
    b.A interface that an anonymous class implements.
     */

    //making anonymous class-->this will be used only once
    Innerclass inn=new Innerclass(){
        @Override
        void sing() {
            System.out.println("This is sing method in anonymousClass..");
        }
    };
    //Making anonymous class sing interface implementation this will used only once
    InterFace it=new InterFace() {
        @Override
        public void InterfaceMethod() {
            System.out.println("this is an anonymous class with implementation of interface");
        }
    };
//Or we can write with using lambda expression bcoz its have only one abstract method--
    InterFace it2=()->{
    System.out.println("This is lambda expression using implementing functional interface method");
};
    public static void main(String[] args) {
        AnonymousClassLearn an= new AnonymousClassLearn();
       an.it.InterfaceMethod();
       an.inn.sing();
       an.it2.InterfaceMethod();
    }
}


class Innerclass{
    void sing(){
        System.out.println("this is sing method");
    }
}

interface InterFace{
    void InterfaceMethod();
}
