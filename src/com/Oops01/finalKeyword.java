package com.Oops01;

public class finalKeyword {
    public static void main(String[] args) {
        int num1=3;
        final int num2=5;
        System.out.println("Learning about final key word...");
        System.out.println("num1 is : "+num1);
        num1=9;
        System.out.println("Now num1 is :"+num1);
        System.out.println("num2 is : "+num2);
        //num2=7;//this will throw error can not assign value
    }
}

/*
final variable-> Variable with final keyword can not be assigned again have to declare it value
first and once the value assign to can not be changed.

final Method-->Method with final key word can not be overridden with its child or subclass
but subclass can use that .

final class --> class with final key word can not be extended or inherited in other classes.
final class child class banane ni dega.
 */

class parent1{
    void sya(){
        System.out.println("Hello children");
    }
    final void parentShow(){
        System.out.println("This is parent class with final method ..");
    }
}
class subclass extends parent1{
    void showSubclass(){
        System.out.println("this is subclass");
    }
//void parentShow(){//this will throw an error trying to override method
//    System.out.println("trying to override parent final class ..");
//}

    @Override
    void sya() {
        System.out.println("Good morning parent");
    }

    public static void main(String[] args) {
        subclass sb=new subclass();
        sb.parentShow();
        sb.showSubclass();
        sb.sya();
    }
}

//eg final class -->
final class A{
    void hey(){
        System.out.println("Hello jack");
    }
}
//class B extends A{ //can not extends
//}

//In java multilevel  inheritance allowed h but multiple inheritance not allowed h
//eg- A extends to B ,C extends to B but B extends to A and B extends to D not allowed .
//multiple allowed ni h man lo A k and foo() function h and D k andr v foo() function h to java will confuse so jaha ambiguity hoga waha java allow ni krega