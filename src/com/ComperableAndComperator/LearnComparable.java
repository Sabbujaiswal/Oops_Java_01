package com.ComperableAndComperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnComparable {
    /*
 The Comparable Interface-->The interface is found in java.lang package and contains only one method named compareTo(object).
It provides single sorting sequence  only,i.e.,you can sort the element on the basis of single data member only.
for eg-it may be , name,age,id or rollNo or anything else.
public int compareTo(Object obj):it is used to compare the current object with specified object.it returns-
a.positive integer:current object is greater than specified object.
b.Negative integer:current object is less than specified object.
c.Zero :if the  current object equals to specified object.
     */
    public static void main(String[] args) {
        Student st1=new Student("Jack",20,6);
        Student st2=new Student("Mack",25,4);
        Student st3=new Student("Rack",15,2);
        Student st5=new Student("Bore",30,9);
        Student st4=new Student("Aax",30,9);

        List<Student> stList=new ArrayList<>();
        stList.add(st1);
        stList.add(st2);
        stList.add(st3);
        stList.add(st4);
        stList.add(st5);
        System.out.println(stList);
        Collections.sort(stList);
        System.out.println(stList);
    }
}

class LearnComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }
    /*
    The comparator interface defines a compare(agr1,agr2) method with two arguments that represent compared object,
    and works similarly to the Comparable.compareTo() method.
     */
    public static void main(String[] args) {
        Student st11=new Student("Jack",20,6);
        Student st22=new Student("Mack",25,4);
        Student st33=new Student("Rack",15,2);
        Student st55=new Student("Bore",30,10);
        Student st44=new Student("Aax",30,9);

        List<Student> stList1=new ArrayList<>();
        stList1.add(st11);
        stList1.add(st22);
        stList1.add(st33);
        stList1.add(st44);
        stList1.add(st55);
        System.out.println(stList1);
        Collections.sort(stList1,(obj1,obj2)->{
            return obj1.name.compareTo(obj2.name);
        });
        System.out.println(stList1);
    }
}