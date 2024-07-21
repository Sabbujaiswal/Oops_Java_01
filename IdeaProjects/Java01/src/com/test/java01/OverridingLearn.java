package com.test.java01;

public class OverridingLearn extends Car {
    @Override
    void showCar(String mileage) {
        System.out.println("Override the function from parent class Car and mileage is" + mileage);
    }

    public static void main(String[] args) {
        Car cr = new Car();
        cr.showCar("Honda");
        OverridingLearn r=new OverridingLearn();
        r.showCar("R15");
    }
}

/*
Oops 4 pillers-Abstraction, encapsulation, polymorphism, and inheritance
Polymorphism- it is two types
 (i) Compile Time polymorphism(we can achieve compile time polymorphism by method overloading).
(ii)Run time polymorphism(we can achieve Run time polymorphism by method Overriding)

Method Overriding-a.same method, b. Different class ,c. same arguments, d.Inheritance
 */
class Car {
    void runCar(String name, String color, double prize) {
        System.out.println(color + " " + name + " car running on the road and car prize is " + prize);
    }

    void showCar(String mileage) {
        System.out.println("Mileage of the car is 40km/lit");
    }
}