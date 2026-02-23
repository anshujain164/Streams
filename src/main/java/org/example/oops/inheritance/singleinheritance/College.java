package org.example.oops.inheritance.singleinheritance;

class Person{
    protected String name;
    protected int age;

    public void showDetails(){
        System.out.println("name : " + name);
        System.out.println("age : "+ age);
    }
}

/// child class
class Student extends Person{
    int grade;

    public void study(){
        System.out.println(name + "is studying in grade" + grade);
    }
}
public class College {
    public static void main(String[] args){
        Student student = new Student();
        student.age = 20;
        student.name = "Anshu";
        student.grade = 30;

        student.showDetails();
        student.study();

    }
}
