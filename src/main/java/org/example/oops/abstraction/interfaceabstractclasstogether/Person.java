package org.example.oops.abstraction.interfaceabstractclasstogether;

abstract class People{
    String name;
    People(String name){
        this.name = name;
    }

    abstract void work();
}

interface Payable{
    void paySalary();
}

class Employee extends People implements Payable{
    String salary;
    public Employee(String name, String salary){
        super(name);
        this.salary = salary;
    }
    public void work(){
        System.out.println(name + " is working");
    }

    public void paySalary(){
        System.out.println("salary Paid "+ salary);
    }
}
public class Person {
    public static void main(String[] args){
        Employee employee = new Employee("Anshu" , "5000");
        employee.work();
        employee.paySalary();
    }
}
