package com.genericsAndWrapperClasses;

public class GenericsMethods {
    public static void main(String[] args) {
       say("Hello");
       say(50);
        GenericsMethods gn=new GenericsMethods();
       // gn.method("No");//we have bounded with number now it will take only number.
        gn.method(69);
        BoundGeneric bn=new BoundGeneric();
        System.out.println("This will print referance of the class-- ");
       // gn.method(bn);//bounded this method
    }

    static <G> void say(G data){
        System.out.println(data);
    }

    //when we bound generics
    <E extends Number> void method(E data1){
        System.out.println(data1);
    }
    /*
    Bounded Generic Type->if we want to use generics for some specific type(such as accept data of number type (Etc.))
    only then we can use bounded type.
    in this case of bound type we use the extends keyword.
    example below--
     */
}
class BoundGeneric{

}
