package com.ComperableAndComperator;

public class Student implements Comparable<Student> {
    /*
    Comparable And Comparator-->To sort custom objects like student or employee, we need to provide explicit sorting logic
    To achieve this,Java Provides the comparable and comparator interfaces.
    Comparable and comparator in java allows us to define custom sorting behaviour for object,including sorting based on
    multiple data member.
     */
    String name;
    int age;
    int id;

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}'+"\n";
    }

    public int compareTo(Student that) {
        //agar age equals ha to name k basis pe sort krega
        if(this.age==that.age){
            return this.name.compareTo(that.name);
        }
       return this.age-that.age;
    }

}
