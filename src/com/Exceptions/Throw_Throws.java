package com.Exceptions;

public class Throw_Throws {
    //Throws --Ye bs itna btata h k function excpton throw kr skta h . ( Usko explicitaly aap handle kr lena)
    //throws ka mtlb ek sket hota h programmer k lie k iss function ko aap use kr rhe ho ye excdption throw kr skta h

    //throw-->by throw key word we can throw custom exception
    public static void main(String[] args) {
       int res= divideNum(10,5);
        System.out.println(res);
       try{
           divideNum(10,0);
       }catch (Exception e){
           System.out.println("Exception handled ");
       }

        //handeling
        try {
            double AreaResult=Area(-3);
            System.out.println("Area of circle is--"+AreaResult);
        }catch (ArithmeticException e){
            System.out.println("Exception caught  "+e.getMessage());
        }
    }

    public static int divideNum(int a,int b) throws ArithmeticException{
        int c=a/b;
        return c;
    }

    public static double Area(int r) throws ArithmeticException{
        if(r<0){
            throw new ArithmeticException("Radious can not be negative");
        }
        double result=Math.PI*r*r;

        return result;
    }

}
