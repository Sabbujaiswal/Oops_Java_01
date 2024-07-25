package com.Oops01;

public class InheritanceLearn extends Company {
    public static void main(String[] args) {
        InheritanceLearn hr = new InheritanceLearn();
        hr.name = "Rohan";
        hr.salary = 4500000;
        hr.getSalary();
    }
}

/*
Inheritance is one of the key feature of Oops that allows us to create new class from a existing class .
the new class that is created is known as subclass (child or derived class)and the existing class where
 the child is derived is known as superclass(Parent or base class)
 */
class Company {
    String name;
    int salary;
    void getSalary() {
        System.out.println(name+" salary is "+ salary);
    }
}

