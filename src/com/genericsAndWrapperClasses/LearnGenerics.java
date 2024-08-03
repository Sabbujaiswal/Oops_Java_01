package com.genericsAndWrapperClasses;

public class LearnGenerics {
    public static void main(String[] args) {
        /*
Generics-->Generics means parameterized types.Using Generics , it is possible to create classes
that work with different data type.
 An Entity such as class,interface or method that operate on a parameterized type is a generic entity.
         */
        Dog<Integer> dg1=new Dog<>(2);//
        Dog<String> dg2=new Dog<>("Leo");
        System.out.println("Name of the  "+dg2+ " Having id "+dg1);
        System.out.println("Id of the dog as integer "+dg1.getId() +" and Id of the dog as a Sting is "+dg2.getId());
    }
}

class Dog<E>{
    E id;
    public Dog(E id){
        this.id=id;
    }

    @Override
    public String toString() {
        return
                "Dog = " + id
                ;
    }

    public E getId() {
        return id;
    }
}