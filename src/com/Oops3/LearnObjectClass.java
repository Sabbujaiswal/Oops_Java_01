package com.Oops3;

import java.util.Objects;

public class LearnObjectClass {
    /*
    Object class methods
    Here we will learn about java o object class methods
    toStirng method- return object that is human-readable if we don't read then
    it will print object reference which is in heap memory.
    #Contract behind hashCode and equals method--gae do object same h to unka hash code v memory m same hona chahie
     */

    public static void main(String[] args) {
        Car1 cr1=new Car1("Creta","Honda-C35",2024);
        Car1 cr2 =new Car1("Creta","Honda-C35",2024);
        System.out.println(cr1.equals(cr2));
        System.out.println(cr1==cr2);
        System.out.println(cr1);
        System.out.println(cr1.hashCode());
        System.out.println(cr2.hashCode());
    }
}


class Car1{
    String name;
    String model;
    int year;

    public Car1(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car1{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car1 car1)) return false;
        return year == car1.year && Objects.equals(name, car1.name) && Objects.equals(model, car1.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, year);
    }
}