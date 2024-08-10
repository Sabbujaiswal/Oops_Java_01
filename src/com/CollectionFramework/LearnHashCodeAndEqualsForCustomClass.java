package com.CollectionFramework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class LearnHashCodeAndEqualsForCustomClass {
    public static void main(String[] args) {
        Set<Student> st=new HashSet<>();
        st.add(new Student("Ram",2));
        st.add(new Student("Rahul",5));
        st.add(new Student("Jack",4));
        st.add(new Student("Rahul",5));
        //to check try with and without hashSet and equals methods.
        System.out.println(st);
        Student st1=new Student("Jack",10);
        Student st2=new Student("Jack",20);
        Student st3=new Student("Sabbu",20);
        System.out.println(st1.equals(st2));
        System.out.println(st1==st2);
        System.out.println(st2.equals(st3));
        System.out.println(st2==st3);

    }
}
/*
Very Important--
Java hashSet of Custom object--When using Set and HashSet in java, for the primitive types we can just use it without
worry about how to implement the hashcode and comparison logic.
but when you want to use the Set with a custom class by putting custom object into the set that custom class has to implement
the hasCode() and equal methods inorder to hashSet work.
 */
class Student{
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {//this will check students are equals or not.
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return id == student.id;
    }
//As set does not allowed duplicate for that we have to generate equals and hashCode method. for custom class
    @Override
    public int hashCode() { //this see that two student are different or not on the basis of ids
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
//enum means koi type h and we want that bs yhi type supported h aur koi ni jaise color hm chahte h
// kuchh perticular color hi use to hm enum class bna skte h
enum Color{
    RED,GREEN,BLACK;
    public static void main(String[] args) {
        System.out.println(Color.RED);
    }
}

