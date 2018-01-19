package com.Mex;

//Lambdas, predicates, suppliers and functions exercises

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {


        Employee john = new Employee("John Doe", 35);
        Employee jane = new Employee("Jane Doe", 20);
        Employee ming = new Employee("Mad Ming", 50);
        Employee JSmith = new Employee("John Smith", 25);
        Employee Dick = new Employee("Dick Wang", 32);
        Employee Rick = new Employee("Slick Rick", 40);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(john);
        employeeList.add(jane);
        employeeList.add(ming);
        employeeList.add(JSmith);
        employeeList.add(Dick);
        employeeList.add(Rick);

        Function<Employee, String> getLastName = (Employee employee) -> {
            return employee.getName().substring(employee.getName().indexOf(' ') + 1);
        };

        String lastName = getLastName.apply(employeeList.get(2));
        System.out.println(lastName);

        Function<Employee, String> getFirstName = (Employee employee) -> {
            return employee.getName().substring(0, employee.getName().indexOf(' '));
        };

        String firstName = getFirstName.apply(employeeList.get(2));
        System.out.println(firstName);

        Random random1 = new Random();
        for(Employee employee : employeeList){
            if (random1.nextBoolean()){
                System.out.println(getTheName(getFirstName, employee));
            }else {
                System.out.println(getTheName(getLastName, employee));
            }
        }

        Function<Employee, String> upperCase = employee -> employee.getName().toUpperCase();
        Function<String, String> FirstName = name -> name.substring(0, name.indexOf(' '));
        Function chainedFunction = upperCase.andThen(FirstName);
        System.out.println(chainedFunction.apply(employeeList.get(3)));

        BiFunction<String, Employee, String> concatAge = (String name, Employee employee) ->{
            return name.concat(" " + employee.getAge());
        };

        String upperName = upperCase.apply(employeeList.get(0));
        System.out.println(concatAge.apply(upperName, employeeList.get(0)));


        IntUnaryOperator incby5 = i -> i + 5;
        System.out.println(incby5.applyAsInt(5));



//        printEmployeesByAge(employeeList, "employees over 30", employee -> employee.getAge() > 30 );
//        printEmployeesByAge(employeeList, "\nemployees under 30", employee -> employee.getAge() < 30 );
//        printEmployeesByAge(employeeList, "\nemployees under 25", new Predicate<Employee>() {
//                    @Override
//                    public boolean test(Employee employee) {
//                        return employee.getAge() <25;
//                    }
//                });
//
//        System.out.println(" ");
//
//        IntPredicate intp = i -> i > 15;
//        IntPredicate intr = i -> i < 100;
////        System.out.println(intp.test(10));
////        System.out.println(intp.test(20));
////        System.out.println(intp.test(15));
//        System.out.println(intr.test(10));
//        int a = 10;
//        System.out.println(intr.test(a + 15));
//
//        System.out.println(intp.and(intr).test(40));    //if both predicates are true, true will be returned
//        System.out.println(intp.and(intr).test(10));    //if one of the predicates is false, false will be returned
//
//        Random random = new Random();
//        Supplier<Integer> randomSupplier = () -> random.nextInt(1000);
//        for(int i=0; i<10; i++){
//          //  System.out.println(random.nextInt(100));
//            System.out.println(randomSupplier.get());
//        }
//
//        employeeList.forEach(employee -> {
//            String lastName = employee.getName().substring(employee.getName().indexOf(' ') +1);
//            System.out.println("Last name is: " + lastName);
//        });


//        employeeList.forEach(employee -> {
//            System.out.println(employee.getName());
//            System.out.println(employee.getAge());
//        });
//        System.out.println("*****************");
//        System.out.println("Employees over 30");
//        System.out.println("*****************");
//
//       employeeList.forEach(employee -> {
//            if(employee.getAge() > 30){
//                System.out.println(employee.getName() + " " + employee.getAge());
//        }});

//        for(Employee employee : employeeList){
//            if(employee.getAge() > 30){
//                System.out.println(employee.getName() + " " + employee.getAge());
//            }
//        }

//        System.out.println("*****************");
//        System.out.println("Employees under 30");
//        System.out.println("*****************");
//
//        employeeList.forEach(employee -> {
//            if(employee.getAge() < 30){
//                System.out.println(employee.getName() + " " + employee.getAge());
//            }});

}   private static String getTheName(Function<Employee, String> getName, Employee employee){
        return getName.apply(employee);
    }

    private static void printEmployeesByAge(List<Employee> employeeList, String AgeText, Predicate<Employee> ageCondition) {
        System.out.println(AgeText);
        System.out.println("*****************");
        for (Employee employee : employeeList) {
            if (ageCondition.test(employee)) {
                System.out.println(employee.getName() + " " + employee.getAge());
            }
        }
    }
}
