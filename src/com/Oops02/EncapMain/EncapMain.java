package com.Oops02.EncapMain;

import com.Oops02.PackageAndEncapsulation;

public class EncapMain {
    /*
    Static key word--> same definition applied for method as well

    1.Its a class level variable , memory allocation of such level variables only happens once
     when the class is loaded in the memory.
    2. if an object modifies the value of static variable, the change is reflected across all the objects.
    3.static variable can be used in any typeof method static or non-static.
    4. non static varibale can not be used inside static method it wll throw compile time error.
     */
   public static int rate=30;
   public static String name="Ram";
    int age=45;
   public static void meth1(){
        System.out.println("Hello this is static meth one");
    }
    public void meth2(){
        System.out.println("this is a non static meth two");
    }
    public static void main(String[] args) {
        PackageAndEncapsulation pc=new PackageAndEncapsulation();
        pc.setId(50);
        pc.setCity("Pune");
        pc.setPan("XYZ");
        System.out.println(pc.getId());
        System.out.println(pc.getCity());
        System.out.println(pc.getPan());
        name="";
       meth1();
    }
}
