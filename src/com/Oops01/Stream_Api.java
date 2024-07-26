package com.Oops01;

import com.Oops02.PackageAndEncapsulation;

public class Stream_Api {
    public static void main(String[] args) {
        PackageAndEncapsulation pe=new PackageAndEncapsulation();
       // pe.address="new";//here protect will throw error
        //noe trying to access public and private
        //pe.id=12324; this wil throw and error bcoz id is private
        pe.encap="jacy";//this will be accessible bcoz of public
       // pe.degree="btech"; this will throw error
        System.out.println("encap is .."+pe.encap);
        System.out.println("Learing stream API here");
        System.out.println("Branch DevA m h ");
    }
}
class CheckingProtected extends PackageAndEncapsulation{
    public static void main(String[] args) {
        CheckingProtected chp=new CheckingProtected();
        chp.address="Varanasi";//here we can access;

    }
}