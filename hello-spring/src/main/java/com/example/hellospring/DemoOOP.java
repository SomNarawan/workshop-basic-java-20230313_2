package com.example.hellospring;

public class DemoOOP {
    public static void main(String[] args) {
        Employee employee = new Employee();
//        employee = employee.toString()
//        .toString() -> className + hashCode(ตำแหน่งใน memory)
        System.out.println(employee);
        System.out.println(employee.toString());


        if (employee instanceof Object) {
            System.out.println("OK");
        }

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        System.out.println("employee1 : " + employee1);
        System.out.println("employee2 : " + employee2);

        if(employee1 == employee2){
            System.out.println("Equal 1");
        }

        if(employee1.equals(employee2)){
            System.out.println("Equal 2");
        } else {
            System.out.println("Not Equal 2");
        }
    }
}