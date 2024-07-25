package com.Oops01;

public class ConstructorLearn {
    public static void main(String[] args) {
        Complex c = new Complex();
        Complex c1 = new Complex("RAM", 20);
        c.print();
        Complex c2=new Complex(2,4);
        c2.getNUm(3);
        c2.print();
    }
}

/*Constructors are invoked implicitly when you instance objects.
The two rules for crating a constructor are:
a.The Name of the constructor should be same as the name of class
b.Constructor don't have return type.
note a default constructor is automatically crated by the java compiler if its not explicitly defined
c. A constructor can be overloaded but can not be overridden.
 */
class Complex {
    int a, b;
    int x, y;

    public Complex() {// this is a constructor without parameter
        System.out.println("This is a constructor");
    }

    //this is a parameterised constructor--
    public Complex(String name, int age) {
        System.out.println("Name is " + name + " age is " + age);
    }

    void print() {
        System.out.println("Value of a & b is  " + a + " , " + b);
    }
    void getNUm(int n){
        System.out.println("Number will be always +2 of current : " +(n+2));
        this.print();
    }

    //This keyword->this keyword use to refer the current object inside a method or a constructor
    Complex(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Sum of x & y is :" + (x + y));
    }
}

