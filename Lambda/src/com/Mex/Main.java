package com.Mex;

import javax.swing.text.html.ListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//	new Thread(()-> {
//	    System.out.println("printing from runnable");
//        System.out.println("that's the next line");
//        System.out.println("and there goes the third line");
//    }).start();

//	Employee john = new Employee("John Doe", 35);
//	Employee jane = new Employee("Jane Doe", 20);
//	Employee ming = new Employee("Mad Ming", 50);
//
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(john);
//        employeeList.add(jane);
//        employeeList.add(ming);


    //here is the method written the standard way
//        Collections.sort(employeeList, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2){
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });

//here is the method as a lambda expression
//        Collections.sort(employeeList, (employee1, employee2) -> employee1.getName().compareTo(employee2.getName()));
//        for(Employee employee: employeeList){
//            System.out.println(employee.getName());
//        }

//        String mumboJumbo = doTheString(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                return s1.toUpperCase() + " " + s2.toUpperCase();
//            }
//        },
//                employeeList.get(0).getName(), employeeList.get(1).getName());



//        UpperConcat uc =(s1, s2) -> {
//            String result = s1.toUpperCase() + " " + s2.toUpperCase();
//            return result;
//        };
//        String mumboJumbo = doTheString(uc, employeeList.get(0).getName(), employeeList.get(1).getName());
//
//        System.out.println(mumboJumbo);

        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doStuff();
        System.out.println(s);
    }

    public final static String doTheString(UpperConcat uc, String s1, String s2){
        return uc.upperAndConcat(s1, s2);
    }

}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat{
    public String upperAndConcat(String s1, String s2);
}

class AnotherClass{
    public String doStuff(){
        System.out.println("the name of another class is " + getClass().getSimpleName() );
        return Main.doTheString(new UpperConcat() {
            @Override
            public String upperAndConcat(String s1, String s2) {
                System.out.println("The name of the anonymous class is" + getClass().getSimpleName());
               return s1.toUpperCase() + " " + s2.toUpperCase();
            }
        }, "String1", "String2");
    }
}