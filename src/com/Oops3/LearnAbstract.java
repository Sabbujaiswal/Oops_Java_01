package com.Oops3;

public class LearnAbstract {
    /*
    Abstract class-->1.Abstract class in java can not be initiated(we can not crate a object of abstract class).
    2.we use abstract key word to declare abstract class.
    3.A abstract class can have both regular method(concrete method) and abstract method.
    4.A method that does not have body is known as abstract method.
    5.we can use abstract class properties and method by its children class
    6.if abstract class have abstract method then child class will have to inherit that method.
    7.Abstract method allowed only in abstract class.
    Real time example--Vehicle have properties of run,accelerate and horn on the behalf of that we can create car ,scooter etc.
    eg2-Home -> have propeties front door,back door, rooms using this properties we can crate villas, Hotel,flats and cam use the property of HOme.
     */
    public static void main(String[] args) {
        System.out.println("Learning java abstract class and method...");
        Car cr=new Car();
        cr.horns("G-Wagon");
        cr.run();
    }
}

abstract class Vehicle{
    abstract void run();
    abstract void horns(String carName);
    void say(){
        System.out.println("hello this is my car..");
    }
}
class Car extends Vehicle{

    @Override
    void run() {
        System.out.println("Thi is run method of abstract class using  in car class..");
    }

    @Override
    void horns(String Name) {
        System.out.println("This is a horns method of abstract class using in car class..."+ Name);
    }
}