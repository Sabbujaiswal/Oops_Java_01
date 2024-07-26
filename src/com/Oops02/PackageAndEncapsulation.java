package com.Oops02;

import com.Oops02.EncapMain.EncapMain;

public class PackageAndEncapsulation {
    /*
    Encapsulation->
    Encapsulation refer to bundling of fields and method inside a singe.its help in achieve the data hiding.
    we can use access modifier to achieve data hiding
     */
   //testing public and private access modifier
    private int id;//can be access only same package same class not anywhere;
    private String city;
    private String pan;
    public String encap;
    String degree;  //this default or package private can not be accessible in different package
    protected String address; //accessible everywhere except difference package non subclass or child class

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getPan() {
        return pan;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public static void main(String[] args) {
        System.out.println("Staring Encapsulation....");

        EncapMain eg=new EncapMain();
        eg.rate=30;
        System.out.println(EncapMain.rate);
        System.out.println(eg.rate);//so there is no need to make a class we can achieve it by class name its self.
        EncapMain eg2=new EncapMain();
        System.out.println("eg2 is value will be same "+eg2.rate);
        System.out.println("eg2 is value will be same "+EncapMain.rate);
        EncapMain.meth1();//if method static
        EncapMain eg3=new EncapMain();
        eg3.meth2();
        eg.meth1();//will through warning that it can be accessible through class itself.

    }
}
