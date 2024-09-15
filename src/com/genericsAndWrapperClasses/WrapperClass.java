package com.genericsAndWrapperClasses;

public class WrapperClass {
    /*
    Wrapper Class->A wrapper class in java is a class whose objects wraps or contains primitive data type.
    when we create an object to a wrapper class, it contains a fields and in this field, we can store primitive data types.
    Primitive data type    Wrapper Class
        int                  Integer
        char                  Character
        byte                  Byte
        short                  Short
        float                 Float
        double                 Double
        boolean                 Boolean
 Need of wrapper class-->1.The classes in java.util package handle only object hence wrapper class help in this also.
 2.Dta structure in collection framework such as ArrayList, Vector,store only objects not primitive data type

 **AutoBoxing and Unboxing--> 1.Conversion of int into Integer ,long into Long etc. known as AutoBoxing.
 2.Conversion of Integer into int ,Double into double,Character into char in known as UnBoxing this is revers of Autoboxing.
     */
    public static void main(String[] args) {
       Integer obj1=Integer.valueOf(20); //creating object(Autoboxing)
        System.out.println(obj1);
        Integer obj2=20; //Autoboxing (creating object)
        int obj=obj1; //unboxing

      Boolean bl=Boolean.valueOf("false"); //valueof method will store this string as a boolean
        boolean bl1=bl;
        System.out.println(bl1);
        Integer in=Integer.valueOf("30");//method wil store as integer.
        System.out.println(in*4);

    }
}