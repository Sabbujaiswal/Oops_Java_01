package com.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamPipeLineOperations {
    public static void main(String[] args) {
        /* 1. Stream is a sequence of elements that supports various methods that can be pipelined to produce the desired result.
  For example, you can filter, map, and collect elements using streams.
 2.The Stream interface is part of the java.util.stream package.

3.Collector Class--> it is introduce in java8 onwoard.
4.colletors use in stream api operation for variouse usefull reduction opration.
 it have predefine method that is usefull for stream operation. eg-groupingBy, joining ,toList,toSet etc.
    */
        System.out.println("Stream operation.....");
    }
}

class Employee{
    int age;
    String name;
    String city;
    int id;

    public Employee(int age, String name, String city, int id) {
        this.age = age;
        this.name = name;
        this.city = city;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> emp=new ArrayList<>();
        emp.add(new Employee(20,"Ram","Varanasi",3));
        emp.add(new Employee(25,"Root","Mumbai",5));
        emp.add(new Employee(20,"Jack","Pune",9));
        emp.add(new Employee(30,"John","Hyderabad",10));
        emp.add(new Employee(22,"Rohan","Pune",20));

        //using simple for each method-
//        for(Employee em:emp){
//            System.out.println("Employees is "+em.getName());
//        }

        //System.out.println(emp);
        // Stream<Employee> employeeStream=emp.stream();
        //list all the employee name
        List<String> EmplyName=emp.stream().map(empName->empName.getName()).toList();
        System.out.println(EmplyName);

        //employee name age greate then 20
        List<String> EmpName=emp.stream().filter(empl->empl.getAge()>20).map(empl->empl.getName())//intermediate operation
                .toList();//terminal operation
        System.out.println(EmpName);

        //print all the city name of employee-
        List<String> EmpCity=emp.stream().map(empCityName->empCityName.getCity()).toList();
        System.out.println("Employee City name "+EmpCity);

        //print all distinct city of employee
        List<String> CityName=emp.stream().map(cityName->cityName.getCity()).distinct().toList();
        System.out.println("Distinct Cities-"+CityName);

        //get count of employee whose age>20;
        long empCount=emp.stream().filter(empAge->empAge.getAge()>20).count();
        System.out.println(empCount);

        //get first 2 employee object as a list.
        List<Employee> firstTwoEmp=emp.stream().limit(2).toList();
        System.out.println("Fiest Two Emplyee "+firstTwoEmp);

        //Varify any employee <18;
        boolean isMinor=emp.stream().anyMatch(AgeCheck->AgeCheck.getAge()<18);
        System.out.println(isMinor);

        //get employee id insorted order.
        List<Integer> EmpIDSorted=emp.stream().map(empID->empID.getId()).sorted().toList();
        System.out.println("Sorted Emp ID is .."+EmpIDSorted);

        //if we use sorted comparator then it will sort object by the condition
        List<Employee> sortedWithID= emp.stream().sorted((e1,e2)->{
            return e1.getId()-e2.getId();
        }).toList();
        System.out.println("Using Comparator.."+sortedWithID);

        //Minimum age Emp details
        Employee empDetails=   emp.stream().min((e1,e2)->{
            return  e1.getAge()-e2.getAge();
        }).get();

        System.out.println("Minimum Age Emp details--- "+empDetails);
        //maximum age emp details
        Employee maxAge =emp.stream().max((e1,e2)->{
            return e1.getAge()-e2.getAge();
        }).get();
        System.out.println("Max Age Emp Details--"+maxAge);

        //average age of employee
        double AvgAge=emp.stream().mapToDouble(AvAge->AvAge.getAge()).average().getAsDouble();
        System.out.println(AvgAge);

//collect all the employee name as a list whose age >20;
        List<String> Namelist=emp.stream().filter(empAge->empAge.getAge()>20).map(empName->empName.getName()).collect(Collectors.toList());
        System.out.println("Name age 20 above  "+Namelist);
        //collect -is a terminal method,
        // Colletors - is a ustility class that provide toList method.
        //for java version above 16 this opearation is simplyfy we can use direct toList.
        List<String> Namelist2=emp.stream().filter(empAge->empAge.getAge()>20).map(empName->empName.getName()).toList();
        System.out.println("Name age 20 above  "+Namelist2);

        //  unique city names//we can use distinct as well
        //Set will not allow duplicate
        Set<String> UniqEmp=emp.stream().map(UnqEmp->UnqEmp.getCity()).collect(Collectors.toSet());
        System.out.println("Employee with Different City"+UniqEmp);

        //collect employee id and their name;
        Map<Integer,String> values=emp.stream().collect(Collectors.toMap(e2->e2.getId(), e3->e3.getName()));
        System.out.println(values);
        //or
        Map<Integer,String> values2=emp.stream().collect(Collectors.toMap(Employee::getId,Employee::getName));
        System.out.println(values2);

    }

}

