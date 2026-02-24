package org.example.oops.inheritance.hierarchicalinheritance;

class Person{
    String name;
    int age;
    int id;

    public void details(){
        System.out.println("name : "+ name +" age : "+ age +" id :" + id);
    }
}

class Student extends Person{
    int grade;
    public void study(){
        System.out.println(name +" is gained "+ grade + " grade");
    }
}

class Emp extends Person{
    int salary;
    public void pay(){
        System.out.println(name + " have " + salary + " salary");
    }
}

public class College {
    public static void main(String[] args){
        Student student = new Student();
        student.name = "Ram";
        student.grade = 80;
        student.id = 1;
        student.age = 16;
        student.details();
        student.study();

        Emp emp = new Emp();
        emp.name= "shyam";
        emp.age = 23;
        emp.id = 2;
        emp.salary = 20000;
        emp.details();
        emp.pay();
    }
}
